package warehouse.express.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import warehouse.express.dbcon.DatebaseConnection;
import warehouse.express.models.SellerProductModel;

public class SellerProductDao {

	public String addProduct(SellerProductModel sellerProductModel) {
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			int a = st.executeUpdate(
					"insert into SellerProduct(ProductName,CategoryId,SubcategoryId,Price,Picture,BrandName,Description,SellerId) values('"
							+ sellerProductModel.getProductName() + "','" + sellerProductModel.getCategoryId() + "','"
							+ sellerProductModel.getSubcategoryId() + "','" + sellerProductModel.getPrice() + "','"
							+ sellerProductModel.getPicture() + "','" + sellerProductModel.getBrandName() + "','"
							+ sellerProductModel.getDescription() + "','"+sellerProductModel.getSellerId()+"')");

			return "Product Added Successfully";
		} catch (Exception e) {

			System.out.println(e);
			return "Fails to Add Product";
		}
	}
	public List<SellerProductModel> getProductsList(String CategoryId,String SubcategoryId, String ProductName,String role,String SellerId){
		List<SellerProductModel> sellerproductList=new ArrayList<SellerProductModel>();
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs=null;
			if(role.equalsIgnoreCase("Seller")) {
				if (SubcategoryId.equalsIgnoreCase("all")) {
					
					if (CategoryId.equalsIgnoreCase("all")) {

						if (ProductName.equalsIgnoreCase("all")) {
							
							rs=st.executeQuery("Select * from SellerProduct where SellerId='"+SellerId+"' ");

						} else {
							rs=st.executeQuery("Select * from SellerProduct where SellerId='"+SellerId+"' and ProductName like '%"+ProductName+"%' ");
						}
					} else {
						if (ProductName.equalsIgnoreCase("all")) {
							
							rs=st.executeQuery("Select * from SellerProduct where  SellerId='"+SellerId+"' and CategoryId='"+CategoryId+"' ");
						} else {
							rs=st.executeQuery("Select * from SellerProduct where SellerId='"+SellerId+"' and CategoryId='"+CategoryId+"' and ProductName like '%"+ProductName+"%' ");
						}

					}

				} else {
					if (ProductName.equalsIgnoreCase("all")) {
						rs=st.executeQuery("Select * from SellerProduct where SellerId='"+SellerId+"' and SubcategoryId='"+SubcategoryId+"' ");
					} else {
						rs=st.executeQuery("Select * from SellerProduct where SellerId='"+SellerId+"' and SubcategoryId='"+SubcategoryId+"' and ProductName like '%"+ProductName+"%' ");
					}

				}
			} else {
				if (SubcategoryId.equalsIgnoreCase("all")) {
					
					if (CategoryId.equalsIgnoreCase("all")) {

						if (ProductName.equalsIgnoreCase("all")) {
							
							rs=st.executeQuery("Select * from SellerProduct");

						} else {
							rs=st.executeQuery("Select * from SellerProduct where ProductName like '%"+ProductName+"%' ");
						}
					} else {
						if (ProductName.equalsIgnoreCase("all")) {
							
							rs=st.executeQuery("Select * from SellerProduct where CategoryId='"+CategoryId+"' ");
						} else {
							rs=st.executeQuery("Select * from SellerProduct where CategoryId='"+CategoryId+"' and ProductName like '%"+ProductName+"%' ");
						}

					}

				} else {
					if (ProductName.equalsIgnoreCase("all")) {
						rs=st.executeQuery("Select * from SellerProduct where SubcategoryId='"+SubcategoryId+"' ");
					} else {
						rs=st.executeQuery("Select * from SellerProduct where SubcategoryId='"+SubcategoryId+"' and ProductName like '%"+ProductName+"%' ");
					}

				}
			}
			while(rs.next()) {
				SellerProductModel selerproductModel=new SellerProductModel();
				selerproductModel.setSellerProductId(rs.getString("SellerProductId"));
				selerproductModel.setProductName(rs.getString("ProductName"));
				selerproductModel.setCategoryId(rs.getString("CategoryId"));
				selerproductModel.setSubcategoryId(rs.getString("SubcategoryId"));
				selerproductModel.setPrice(rs.getString("Price"));
				selerproductModel.setPicture(rs.getString("Picture"));
				selerproductModel.setBrandName(rs.getString("BrandName"));
				selerproductModel.setDescription(rs.getString("Description"));
				selerproductModel.setSellerId(rs.getString("SellerId"));
				selerproductModel.setStatus(rs.getString("Status"));
				if(!role.equalsIgnoreCase("Seller")&&selerproductModel.getStatus().equalsIgnoreCase("Available")) {
					sellerproductList.add(selerproductModel);
				}else if(role.equalsIgnoreCase("Seller")){
					sellerproductList.add(selerproductModel);
				}
				
			}
			
		}catch(Exception e) {
			System.out.println(e);
			
			return null;
		}
		
		return sellerproductList;
	}
	
	public void getStatus(String SellerProductId,String Status, HttpServletResponse response) {
		
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			
			int a=st.executeUpdate("update SellerProduct set Status='"+Status+"' where SellerProductId='"+SellerProductId+"'");
			
			response.sendRedirect("ViewProducts.jsp");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public SellerProductModel getSellerProduct(String SellerProductId) {
		SellerProductModel sellerProductModel =new SellerProductModel();
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs= st.executeQuery("select * from SellerProduct where SellerProductId='"+SellerProductId+"'");
			if(rs.next()) {
				sellerProductModel.setSellerProductId(rs.getString("SellerProductId"));
				sellerProductModel.setProductName(rs.getString("ProductName"));
				sellerProductModel.setPicture(rs.getString("Picture"));
				sellerProductModel.setBrandName(rs.getString("BrandName"));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return sellerProductModel;
	}
}
