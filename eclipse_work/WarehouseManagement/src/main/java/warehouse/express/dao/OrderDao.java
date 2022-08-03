package warehouse.express.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import warehouse.express.dbcon.DatebaseConnection;
import warehouse.express.models.ProductitemModel;
import warehouse.express.models.ProductorderModel;
import warehouse.express.models.StatusList;
import warehouse.express.models.TrackingModel;

public class OrderDao {
	public String setOrder(String SellerId,String BuyerId,String CurrentId,String CurrentUser,String CurrentStatus,String Quantity,String Price,String SellerProductId,HttpServletResponse response) {
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs= st.executeQuery("select * from productorder where SellerId='"+SellerId+"' and BuyerId='"+BuyerId+"' and Status='"+StatusList.CART+"'");
			String productorderId=null;
			if(rs.next()) {
				productorderId = rs.getString("productorderId");
			} else {
				Statement st2 = con.createStatement();
				st2.executeUpdate("insert into productorder(SellerId,BuyerId,CurrentId,CurrentUser,CurrentStatus,Status) values('"+SellerId+"','"+BuyerId+"','"+CurrentId+"','"+CurrentUser+"','"+CurrentStatus+"','"+StatusList.CART+"')",Statement.RETURN_GENERATED_KEYS);
				ResultSet rs2=st2.getGeneratedKeys();
				while(rs2.next()) {
					productorderId = rs2.getString(1);
				}
			}
			Statement st3 = con.createStatement();
			ResultSet rs3= st3.executeQuery("select * from Productitem where productorderId='"+productorderId+"' and SellerProductId='"+SellerProductId+"'");
			String ProductitemId = null;
			if(rs3.next()) {
				ProductitemId = rs3.getString("ProductitemId");
				Statement st4 = con.createStatement();
				st4.executeUpdate("update Productitem set Quantity='"+Quantity+"', Price='"+Price+"' where ProductitemId='"+ProductitemId+"'");
			}else {
				Statement st4 = con.createStatement();
				st4.executeUpdate("insert into Productitem(productorderId,SellerProductId,Quantity,Price) values('"+productorderId+"','"+SellerProductId+"','"+Quantity+"','"+Price+"')",Statement.RETURN_GENERATED_KEYS);
				ResultSet rs4 = st4.getGeneratedKeys();
				if(rs4.next()) {
					ProductitemId = rs4.getString(1);
				}
			}
			response.sendRedirect("ViewProducts.jsp");
		}catch(Exception e){
			System.out.println(e);
		}
		return null; 
	}
	public ProductitemModel getProductItem(String SellerId, String BuyerId, String SellerProductId) {
		ProductitemModel productitemModel=new ProductitemModel();
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from productorder where SellerId='"+SellerId+"' and BuyerId='"+BuyerId+"' and Status='"+StatusList.CART+"'");
			if(rs.next()) {
				Statement st2 = con.createStatement();
				ResultSet rs2=st2.executeQuery("select * from Productitem where productorderId='"+rs.getString("productorderId")+"' and SellerProductId='"+SellerProductId+"'");
				while(rs2.next()) {
					productitemModel.setQuantity(rs2.getString("Quantity"));
				}
			}
		} catch (Exception e) {

			System.out.println(e);

		}
		return productitemModel;
	}
	public List<ProductorderModel> getOrders(String role,String SellerId,String BuyerId,String WarehouseId,String DeliveryBoyId,String Status ){
		List<ProductorderModel> productorderModelList = new ArrayList<ProductorderModel>();
		try {
			String query = "select * from productorder";
			if(role.equalsIgnoreCase("Seller")){
				if(Status.equalsIgnoreCase(StatusList.ORDERED)) {
					query = "select * from productorder where SellerId ='"+SellerId+"' and (Status='"+Status+"' or Status='"+StatusList.ORDER_ACCEPTED+"')";
				}else {
					query = "select * from productorder where SellerId ='"+SellerId+"' and Status!='"+StatusList.ORDERED+"' and Status!='"+StatusList.ORDER_ACCEPTED+"'";
				}
			} else if(role.equalsIgnoreCase("Buyer")){
				if(Status.equalsIgnoreCase(StatusList.CART)) {
					query = "select * from productorder where BuyerId ='"+BuyerId+"' and Status='"+Status+"'";
				} else {
					query = "select * from productorder where BuyerId ='"+BuyerId+"' and Status!='"+StatusList.CART+"'";
				}
			} else if(role.equalsIgnoreCase("Warehouse")){
				if(Status.equalsIgnoreCase(StatusList.ORDER_RECEIVED_BY_WAREHOUSE)) {
					query = "select * from productorder where CurrentId='"+WarehouseId+"' and Status='"+Status+"'";
				} else {
					query = "select * from productorder where productorderId in (select productorderId from Tracking where CurrentUser='"+StatusList.WAREHOUSE+"' and CurrentId='"+WarehouseId+"')";
				}
				
			} else if(role.equalsIgnoreCase("Deliveryboy")){
				if(Status.equalsIgnoreCase(StatusList.ORDER_RECEIVED_BY_DELIVERY_BOY)) {
					query = "select * from productorder where CurrentId='"+DeliveryBoyId+"' and Status='"+Status+"'";
				} else {
					query = "select * from productorder where productorderId in (select productorderId from Tracking where CurrentUser='"+StatusList.DELIVERY_BOY+"' and CurrentId='"+DeliveryBoyId+"')";
				}
			}
			System.out.println(query);
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				ProductorderModel productorderModel=new ProductorderModel();
				productorderModel.setProductorderId(rs.getString("productorderId"));
				productorderModel.setSellerId(rs.getString("SellerId"));
				productorderModel.setBuyerId(rs.getString("BuyerId"));
				productorderModel.setCurrentId(rs.getString("CurrentId"));
				productorderModel.setCurrentUser(rs.getString("CurrentUser"));
				productorderModel.setCurrentStatus(rs.getString("CurrentStatus"));
				productorderModel.setCurrentDate(rs.getString("CurrentDate"));
				productorderModel.setStatus(rs.getString("Status"));
				SellerDao sellerDao =new SellerDao();
				productorderModel.setSellerModel(sellerDao.getSellor(productorderModel.getSellerId()));
				BuyerDao buyerDao = new BuyerDao();
				productorderModel.setBuyerModel(buyerDao.getBuyyer(productorderModel.getBuyerId()));
				productorderModelList.add(productorderModel);
			}
	
		} catch (Exception e) {
			System.out.println(e);
		}
		return productorderModelList;
	}
	
	public List<ProductitemModel> getProductItemList(String productorderId){
		List<ProductitemModel> productitemModelList =new ArrayList<ProductitemModel>();
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from Productitem where productorderId='"+productorderId+"'");
			while(rs.next()) {
				ProductitemModel productitemModel =new ProductitemModel();
				productitemModel.setProductitemId(rs.getString("ProductitemId"));
				productitemModel.setProductorderId(rs.getString("productorderId"));
				productitemModel.setSellerProductId(rs.getString("SellerProductId"));
				productitemModel.setQuantity(rs.getString("Quantity"));
				productitemModel.setPrice(rs.getString("Price"));
				productitemModel.setStatus(rs.getString("Status"));
				SellerProductDao sellerProductDao = new SellerProductDao();
				productitemModel.setSellerProductModel(sellerProductDao.getSellerProduct(productitemModel.getSellerProductId()));
				productitemModelList.add(productitemModel);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return productitemModelList;
	}
	public void removeFromCart(String ProductitemId,String productorderId,HttpServletResponse response) {
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			st.executeUpdate("delete from Productitem where ProductitemId='"+ProductitemId+"'");
			ResultSet rs=st.executeQuery("select * from Productitem where productorderId='"+productorderId+"'");
			if(!rs.next()) {
				Statement st2 = con.createStatement();
				st2.executeUpdate("delete from productorder where productorderId='"+productorderId+"'");
			}
			response.sendRedirect("viewOrders.jsp?Status="+StatusList.CART);
		} catch (Exception e) {

			System.out.println(e);

		}
	}
	
	public void setStatus(String productorderId,String Status, String OldStatus,TrackingModel trackingModel,HttpServletResponse response) {
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			st.executeUpdate("update Productitem set status='"+Status+"' where productorderId='"+productorderId+"'");
			st.executeUpdate("update productorder set status='"+Status+"',CurrentId='"+trackingModel.getCurrentId()+"',CurrentUser='"+trackingModel.getCurrentUser()+"',CurrentStatus='"+trackingModel.getCurrentStatus()+"',CurrentDate=now() where productorderId='"+productorderId+"'");
			st.executeUpdate("insert into Tracking(productorderId,CurrentId,CurrentUser,CurrentUserName,CurrentStatus) values('"+productorderId+"','"+trackingModel.getCurrentId()+"','"+trackingModel.getCurrentUser()+"','"+trackingModel.getCurrentUserName()+"','"+trackingModel.getCurrentStatus()+"')");
			if(!Status.equalsIgnoreCase(StatusList.ORDER_DISPATCHED_TO_WAREHOUSE) && !Status.equalsIgnoreCase(StatusList.ORDER_DISPATCHED_TO_WAREHOUSE) && !Status.equalsIgnoreCase(StatusList.ORDER_DELIVERED_TO_BUYER)) {
				response.sendRedirect("viewOrders.jsp?Status="+OldStatus);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public List<TrackingModel> getTrackings(String productorderId){
		List<TrackingModel> trackingModelList =new ArrayList<TrackingModel>();
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs= st.executeQuery("select * from Tracking where productorderId='"+productorderId+"'");
			while(rs.next()) {
				TrackingModel trackingModel=new TrackingModel();
				trackingModel.setTrackingId(rs.getString("TrackingId"));
				trackingModel.setProductorderId(rs.getString("productorderId"));
				trackingModel.setCurrentId(rs.getString("CurrentId"));
				trackingModel.setCurrentUser(rs.getString("CurrentUser"));
				trackingModel.setCurrentUserName(rs.getString("CurrentUserName"));
				trackingModel.setCurrentStatus(rs.getString("CurrentStatus"));
				trackingModel.setCurrentDate(rs.getString("CurrentDate"));
				trackingModelList.add(trackingModel);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return trackingModelList;
	}
}
