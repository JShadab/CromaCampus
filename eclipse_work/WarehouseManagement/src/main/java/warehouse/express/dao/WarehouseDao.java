package warehouse.express.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import warehouse.express.dbcon.DatebaseConnection;
import warehouse.express.models.LocationModel;

import warehouse.express.models.WarehouseModel;

public class WarehouseDao {
	
	public String addWarehouse(WarehouseModel warehouseModel) {
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();

			int a = st.executeUpdate("insert into Warehouse(WarehouseName,Phone,Email,Password,ManagerName,Address,LocationId) values('"
					+ warehouseModel.getWarehouseName() + "','" + warehouseModel.getPhone() + "','" + warehouseModel.getEmail() + "','"
					+ warehouseModel.getPassword() + "','" + warehouseModel.getManagerName() + "','" + warehouseModel.getAddress()
					+ "','" + warehouseModel.getLocationId() + "')");

			return "Add Warehouse Registred Successfully";

		} catch (Exception e) {

			System.out.println(e);

		}
		return "Add Warehouse Unsuccessfully";
	}
	
public List<WarehouseModel> ViewWarehouse (){
		
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from Warehouse ");
			 
			List<WarehouseModel> warehouseList=new ArrayList<WarehouseModel>();
			while(rs.next()) {
				
				 WarehouseModel warehouseModel=new WarehouseModel();
				 
				 warehouseModel.setWarehouseId(rs.getString("WarehouseId"));
				 warehouseModel.setWarehouseName(rs.getString("WarehouseName"));
				 warehouseModel.setPhone(rs.getString("Phone"));
				 warehouseModel.setEmail(rs.getString("Email"));
				 warehouseModel.setManagerName(rs.getString("ManagerName"));
				 warehouseModel.setAddress(rs.getString("Address"));
				 warehouseModel.setLocationId(rs.getString("LocationId"));
				 
				 Statement st2 = con.createStatement();
				 ResultSet rs2=st2.executeQuery("select * from Location where LocationId='"+rs.getString("LocationId")+"'");
				 if(rs2.next()) {
					 LocationModel locationModel=new LocationModel();
					 locationModel.setLocationId(rs2.getString("LocationId"));
					 locationModel.setLocationName(rs2.getString("LocationName"));
					 warehouseModel.setLocationModel(locationModel);	
				 }
				 
				
				 warehouseList.add(warehouseModel);
			}
			 
			 return warehouseList;
		}catch(Exception e) {
			System.out.println(e);
			
		}
		return null;
	}

public void loginWareHouse(String phone, String password,HttpServletResponse response,HttpSession session) {
	try {
		Connection con = DatebaseConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select * from Warehouse where Phone='"+phone+"' and Password='"+password+"'");
		if(rs.next()) {		
				session.setAttribute("LocationId", rs.getString("LocationId"));
				session.setAttribute("WarehouseId", rs.getString("WarehouseId"));
				session.setAttribute("WarehouseName", rs.getString("WarehouseName"));
				session.setAttribute("role","Warehouse");
				
				response.sendRedirect("WareHouseHome.jsp");
					
		}else {
			
			response.sendRedirect("MmessageFailed.jsp?Msg=Invalid Login Details");
		}
		
	
	} catch (Exception e) {
		System.out.println(e);

	}
	
}

public List<WarehouseModel> ViewWarehouse(String LocationId){
	List<WarehouseModel> warehouseList=new ArrayList<WarehouseModel>();
	try {
		Connection con = DatebaseConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select * from Warehouse where LocationId='"+LocationId+"'");
		
		while(rs.next()) {
			 WarehouseModel warehouseModel=new WarehouseModel();
			 warehouseModel.setWarehouseId(rs.getString("WarehouseId"));
			 warehouseModel.setWarehouseName(rs.getString("WarehouseName"));
			 warehouseModel.setPhone(rs.getString("Phone"));
			 warehouseModel.setEmail(rs.getString("Email"));
			 warehouseModel.setManagerName(rs.getString("ManagerName"));
			 warehouseModel.setAddress(rs.getString("Address"));
			 warehouseModel.setLocationId(rs.getString("LocationId"));
			 Statement st2 = con.createStatement();
			 ResultSet rs2=st2.executeQuery("select * from Location where LocationId='"+rs.getString("LocationId")+"'");
			 if(rs2.next()) {
				 LocationModel locationModel=new LocationModel();
				 locationModel.setLocationId(rs2.getString("LocationId"));
				 locationModel.setLocationName(rs2.getString("LocationName"));
				 warehouseModel.setLocationModel(locationModel);	
			 }
			 warehouseList.add(warehouseModel);
		}
		 
		 return warehouseList;
	}catch(Exception e) {
		System.out.println(e);
		
	}
	return warehouseList;
}
 public WarehouseModel getWareHouse(String WarehouseId) {
	 WarehouseModel warehouseModel = new WarehouseModel();
	 try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from Warehouse where WarehouseId='"+WarehouseId+"'");
			if(rs.next()) {
				 warehouseModel.setWarehouseId(rs.getString("WarehouseId"));
				 warehouseModel.setWarehouseName(rs.getString("WarehouseName"));
				 warehouseModel.setPhone(rs.getString("Phone"));
				 warehouseModel.setEmail(rs.getString("Email"));
				 warehouseModel.setManagerName(rs.getString("ManagerName"));
				 warehouseModel.setAddress(rs.getString("Address"));
				 warehouseModel.setLocationId(rs.getString("LocationId"));
				 Statement st2 = con.createStatement();
				 ResultSet rs2=st2.executeQuery("select * from Location where LocationId='"+rs.getString("LocationId")+"'");
				 if(rs2.next()) {
					 LocationModel locationModel=new LocationModel();
					 locationModel.setLocationId(rs2.getString("LocationId"));
					 locationModel.setLocationName(rs2.getString("LocationName"));
					 warehouseModel.setLocationModel(locationModel);	
				 }
				
			}
			 
			 return warehouseModel;
		}catch(Exception e) {
			System.out.println(e);
		}
	 return warehouseModel;
 }
}
