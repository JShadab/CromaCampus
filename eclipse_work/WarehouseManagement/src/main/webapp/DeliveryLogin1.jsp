<%@page import="warehouse.express.dao.DeliveryBoyDao"%>
<%@page import="warehouse.express.dao.WarehouseDao"%>
<%@page import="warehouse.express.dao.SellerDao"%>
<%
	String phone =request.getParameter("phone");
	String password =request.getParameter("password");
	DeliveryBoyDao deliveryBoyDao=new DeliveryBoyDao();
	deliveryBoyDao.loginDeliveryBoy(phone,password,response,session);
%>