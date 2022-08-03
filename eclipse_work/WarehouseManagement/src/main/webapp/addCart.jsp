<%@page import="warehouse.express.dao.OrderDao"%>
<%@page import="warehouse.express.models.StatusList"%>
<% 
	String SellerProductId = request.getParameter("SellerProductId");
	String Quantity = request.getParameter("Quantity");
	String Price = request.getParameter("Price");
	String BuyerId = (String)session.getAttribute("BuyerId");
	String SellerId = request.getParameter("SellerId");
	String CurrentId = BuyerId;
	String CurrentUser = StatusList.BUYER;
	String CurrentStatus = StatusList.CART;
	OrderDao orderDao= new OrderDao();
	orderDao.setOrder(SellerId, BuyerId, CurrentId, CurrentUser, CurrentStatus, Quantity, Price, SellerProductId,response);
%>