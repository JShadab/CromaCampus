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
import warehouse.express.models.SellerModel;

public class SellerDao {

	public String addSeller(SellerModel sellerModel) {
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();

			st.executeUpdate("insert into Seller(Name,Email,Phone,Password,Tin,LocationId,Address) values('"
					+ sellerModel.getName() + "','" + sellerModel.getEmail() + "','" + sellerModel.getPhone() + "','"
					+ sellerModel.getPassword() + "','" + sellerModel.getTin() + "','" + sellerModel.getLocationId()
					+ "','" + sellerModel.getAddress() + "')");
			

			return "Add Seller Registred Successfully";

		} catch (Exception e) {

			System.out.println(e);

		}
		return "Add Seller Unsuccessfully";
	}

	public List<SellerModel> ViewSellers() {

		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("select * from Seller ");

			List<SellerModel> sellerList = new ArrayList<SellerModel>();
			while (rs.next()) {

				SellerModel sellerModel = new SellerModel();

				sellerModel.setSellerId(rs.getString("SellerId"));
				sellerModel.setName(rs.getString("Name"));
				sellerModel.setEmail(rs.getString("Email"));
				sellerModel.setPhone(rs.getString("Phone"));
				sellerModel.setTin(rs.getString("Tin"));
				sellerModel.setLocationId(rs.getString("LocationId"));
				sellerModel.setAddress(rs.getString("Address"));
				sellerModel.setStatus(rs.getString("Status"));
				Statement st2 = con.createStatement();
				ResultSet rs2 = st2
						.executeQuery("select * from Location where LocationId='" + rs.getString("LocationId") + "'");
				if (rs2.next()) {
					LocationModel locationModel = new LocationModel();
					locationModel.setLocationId(rs2.getString("LocationId"));
					locationModel.setLocationName(rs2.getString("LocationName"));
					sellerModel.setLocationModel(locationModel);
				}

				sellerList.add(sellerModel);
			}

			return sellerList;

		} catch (Exception e) {
			System.out.println(e);

		}
		return null;
	}

	public void ActivateorDeactivate(String SellerId, String Status, HttpServletResponse response) {
		String newstatus = null;

		if (Status.equalsIgnoreCase("deactivated")) {
			newstatus = "activated";
		} else {
			newstatus = "deactivated";
		}
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			int a = st.executeUpdate("update Seller set status='" + newstatus + "' where SellerId='" + SellerId + "' ");

			response.sendRedirect("ViewSellers.jsp");

		} catch (Exception e) {

			System.out.println(e);

		}
	}

	public void loginSeller(String phone, String password, HttpServletResponse response, HttpSession session) {
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st
					.executeQuery("select * from seller where Phone='" + phone + "' and Password='" + password + "'");
			if (rs.next()) {
				if (rs.getString("Status").equalsIgnoreCase("activated")) {

					session.setAttribute("SellerId", rs.getString("SellerId"));
					session.setAttribute("Name", rs.getString("Name"));
					session.setAttribute("role", "Seller");

					response.sendRedirect("SellerHome.jsp");

				} else {
					response.sendRedirect("MmessageFailed.jsp?Msg=Seller Account Not Activated");
				}

			} else {

				response.sendRedirect("MmessageFailed.jsp?Msg=Invalid Login Details");
			}

		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public SellerModel getSellor(String SellerId) {
		SellerModel sellerModel = new SellerModel();
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from seller where SellerId='" + SellerId + "'");
			if (rs.next()) {
				sellerModel.setSellerId(SellerId);
				sellerModel.setSellerId(rs.getString("SellerId"));
				sellerModel.setName(rs.getString("Name"));
				sellerModel.setEmail(rs.getString("Email"));
				sellerModel.setPhone(rs.getString("Phone"));
				sellerModel.setPassword(rs.getString("Password"));
				sellerModel.setTin(rs.getString("Tin"));
				sellerModel.setLocationId(rs.getString("LocationId"));
				sellerModel.setAddress(rs.getString("Address"));
				sellerModel.setStatus(rs.getString("Status"));
				LocationDao locationDao = new LocationDao();
				sellerModel.setLocationModel(locationDao.getLocation(sellerModel.getLocationId()));
			}

		} catch (Exception e) {
			System.out.println(e);

		}

		return sellerModel;
	}
}
