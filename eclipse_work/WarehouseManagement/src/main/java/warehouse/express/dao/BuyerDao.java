package warehouse.express.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import warehouse.express.dbcon.DatebaseConnection;
import warehouse.express.models.BuyerModel;

public class BuyerDao {

	public String addBuyer(BuyerModel buyerModel) {
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();

			st.executeUpdate("insert into Buyer(Name,Email,Phone,Password,LocationId,Address) values('"
					+ buyerModel.getName() + "','" + buyerModel.getEmail() + "','" + buyerModel.getPhone() + "','"
					+ buyerModel.getPassword() + "','" + buyerModel.getLocationId() + "','" + buyerModel.getAddress()
					+ "')");

			return "Add Buyer Registred Successfully";

		} catch (Exception e) {

			System.out.println(e);

		}
		return "Add Buyer Unsuccessfully";
	}

	public void loginBuyer(String phone, String password, HttpServletResponse response, HttpSession session) {
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st
					.executeQuery("select * from buyer where Phone='" + phone + "' and Password='" + password + "'");
			if (rs.next()) {
				session.setAttribute("BuyerId", rs.getString("BuyerId"));
				session.setAttribute("Name", rs.getString("Name"));
				session.setAttribute("role", "Buyer");

				response.sendRedirect("BuyerHome.jsp");

			} else {

				response.sendRedirect("MmessageFailed.jsp?Msg=Invalid Login Details");
			}

		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public BuyerModel getBuyyer(String BuyerId) {
		BuyerModel buyerModel = new BuyerModel();
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Buyer where BuyerId='" + BuyerId + "'");
			if (rs.next()) {
				buyerModel.setBuyerId(BuyerId);
				buyerModel.setBuyerId(rs.getString("BuyerId"));
				buyerModel.setName(rs.getString("Name"));
				buyerModel.setEmail(rs.getString("Email"));
				buyerModel.setPhone(rs.getString("Phone"));
				buyerModel.setPassword(rs.getString("Password"));
				buyerModel.setLocationId(rs.getString("LocationId"));
				buyerModel.setAddress(rs.getString("Address"));
				LocationDao locationDao = new LocationDao();
				buyerModel.setLocationModel(locationDao.getLocation(buyerModel.getLocationId()));
			}

		} catch (Exception e) {
			System.out.println(e);

		}

		return buyerModel;
	}
}
