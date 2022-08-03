<%@page import="warehouse.express.dao.SellerDao"%>
<%
	String phone =request.getParameter("phone");
	String password =request.getParameter("password");
	
	SellerDao sellerDao = new SellerDao();
	sellerDao.loginSeller(phone,password,response,session);
%>