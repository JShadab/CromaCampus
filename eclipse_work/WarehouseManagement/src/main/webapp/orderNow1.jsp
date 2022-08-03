<%@page import="warehouse.express.models.TrackingModel"%>
<%@page import="warehouse.express.models.StatusList"%>
<%@page import="warehouse.express.dao.OrderDao"%>
<% 
	String productorderId = request.getParameter("productorderId");
	String total = request.getParameter("total");
	TrackingModel trackingModel=new TrackingModel();
	String BuyerId = (String)session.getAttribute("BuyerId");
	String Name = (String)session.getAttribute("Name");
	trackingModel.setCurrentUserName(Name);
	trackingModel.setCurrentId(BuyerId);
	trackingModel.setCurrentUser(StatusList.BUYER);
	trackingModel.setCurrentStatus(StatusList.ORDERED);
	trackingModel.setProductorderId(productorderId);
	
	OrderDao orderDao = new OrderDao();
	orderDao.setStatus(productorderId,StatusList.ORDERED,StatusList.CART,trackingModel,response);
%>