<%@page import="warehouse.express.models.StatusList"%>
<%@page import="warehouse.express.dao.OrderDao"%>
<% 
	String ProductitemId = request.getParameter("ProductitemId");
	String productorderId =request.getParameter("productorderId");
	OrderDao orderDao=new OrderDao();
	orderDao.removeFromCart(ProductitemId,productorderId,response);
%>