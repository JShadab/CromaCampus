<%@page import="warehouse.express.dao.BuyerDao"%>
<%@page import="warehouse.express.dao.SellerDao"%>
<%
	String phone =request.getParameter("phone");
	String password =request.getParameter("password");
	BuyerDao buyerDao = new BuyerDao();
	buyerDao.loginBuyer(phone,password,response,session);
%>