package warehouse.express.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import warehouse.express.dbcon.DatebaseConnection;
import warehouse.express.models.DeliveryBoyModel;
import warehouse.express.models.LocationModel;
import warehouse.express.models.WarehouseModel;

public class DeliveryBoyDao {
	public String addDeliveryBoy(DeliveryBoyModel deliveryBoyModel) {
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();

			int a = st.executeUpdate("insert into DeliveryBoy(Name,Phone,Email,Password,Experience,WarehouseId) values('"
					+ deliveryBoyModel.getName() + "','" + deliveryBoyModel.getPhone() + "','" + deliveryBoyModel.getEmail() + "','"
					+ deliveryBoyModel.getPassword() + "','" + deliveryBoyModel.getExperience() + "','" + deliveryBoyModel.getWarehouseId()+ "')");

			return "Delivery Boy Added Successfully";

		} catch (Exception e) {

			System.out.println(e);

		}
		return "Fails to Add Delivery Boy";
	}
	
public List<DeliveryBoyModel> ViewDeliveryBoy (String WarehouseId){
		
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from DeliveryBoy where WarehouseId='"+WarehouseId+"'");
			 
			List<DeliveryBoyModel> deliveryBoyList=new ArrayList<DeliveryBoyModel>();
			while(rs.next()) {
				
				DeliveryBoyModel deliveryBoyModel=new DeliveryBoyModel();
				 
				deliveryBoyModel.setDeliveryBoyId(rs.getString("DeliveryBoyId"));
				deliveryBoyModel.setName(rs.getString("Name"));
				deliveryBoyModel.setPhone(rs.getString("Phone"));
				deliveryBoyModel.setEmail(rs.getString("Email"));
				deliveryBoyModel.setExperience(rs.getString("Experience"));
				deliveryBoyModel.setWarehouseId(rs.getString("WarehouseId"));
			
				 
		
				
				deliveryBoyList.add(deliveryBoyModel);
			}
			 
			 return deliveryBoyList;
		}catch(Exception e) {
			System.out.println(e);
			
		}
		return null;
	}
public void loginDeliveryBoy(String phone, String password,HttpServletResponse response,HttpSession session) {
	try {
		Connection con = DatebaseConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select * from DeliveryBoy where Phone='"+phone+"' and Password='"+password+"'");
		if(rs.next()) {		
				session.setAttribute("DeliveryBoyId", rs.getString("DeliveryBoyId"));
				session.setAttribute("Name", rs.getString("Name"));
				session.setAttribute("role","Deliveryboy");
				
				response.sendRedirect("DeliveryBoyHome.jsp");
					
		}else {
			
			response.sendRedirect("MmessageFailed.jsp?Msg=Invalid Login Details");
		}
		
	
	} catch (Exception e) {
		System.out.println(e);

	}
	
}

public DeliveryBoyModel getDeliveryBoy(String DeliveryBoyId){
	DeliveryBoyModel deliveryBoyModel=new DeliveryBoyModel();
	try {
		Connection con = DatebaseConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select * from DeliveryBoy where DeliveryBoyId='"+DeliveryBoyId+"'");
		while(rs.next()) {	 
			deliveryBoyModel.setDeliveryBoyId(rs.getString("DeliveryBoyId"));
			deliveryBoyModel.setName(rs.getString("Name"));
			deliveryBoyModel.setPhone(rs.getString("Phone"));
			deliveryBoyModel.setEmail(rs.getString("Email"));
			deliveryBoyModel.setExperience(rs.getString("Experience"));
			deliveryBoyModel.setWarehouseId(rs.getString("WarehouseId"));
		}
		 
		 return deliveryBoyModel;
	}catch(Exception e) {
		System.out.println(e);
		
	}
	return deliveryBoyModel;
}

}
