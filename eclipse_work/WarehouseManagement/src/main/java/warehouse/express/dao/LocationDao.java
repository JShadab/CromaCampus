package warehouse.express.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import warehouse.express.dbcon.DatebaseConnection;
import warehouse.express.models.LocationModel;




public class LocationDao {

		public String addLocation(LocationModel locationModel,HttpServletResponse response) {
			try {
				Connection con = DatebaseConnection.getConnection();
				Statement st = con.createStatement();
				
				int a=st.executeUpdate("insert into Location(LocationName) values('"+locationModel.getLocationName()+"')");
				
				response.sendRedirect("AmessageSuccess.jsp?Msg=Add Location Registred Successfully");
				
				return "Add Location Registred Successfully";
				
			}catch(Exception e){
				
				System.out.println(e);
				try {
					response.sendRedirect("AmessageFiled.jsp?Msg=Add Location Unsuccessfully");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			return "Add Location Unsuccessfully";	
		}
	public  List<LocationModel> getLocations(){
		
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from Location");
			List<LocationModel> locatioList=new ArrayList<LocationModel>();
			while(rs.next()) {
				LocationModel locationModel=new LocationModel();
				locationModel.setLocationId(rs.getString("LocationId"));
				locationModel.setLocationName(rs.getString("LocationName"));
				locatioList.add(locationModel);
			}
			return locatioList;
			
		}catch(Exception e) {	
			System.out.println(e);
			return null;
		}
	}
	public LocationModel getLocation(String LocationId) {
		LocationModel locationModel=new LocationModel();
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from Location where LocationId='"+LocationId+"'");
			if(rs.next()) {		
				locationModel.setLocationId(rs.getString("LocationId"));
				locationModel.setLocationName(rs.getString("LocationName"));
			}
		
		} catch (Exception e) {
			System.out.println(e);

		}
		return locationModel;
	}
}
