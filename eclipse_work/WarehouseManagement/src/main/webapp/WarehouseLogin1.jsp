<%@page import="warehouse.express.dao.WarehouseDao"%>
<%@page import="warehouse.express.dao.SellerDao"%>
<%
	String phone =request.getParameter("phone");
	String password =request.getParameter("password");
	WarehouseDao warehouseDao = new WarehouseDao();
	warehouseDao.loginWareHouse(phone,password,response,session);
%>