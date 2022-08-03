<%@page import="warehouse.express.models.BuyerModel"%>
<%@page import="warehouse.express.dao.BuyerDao"%>
<%@page import="warehouse.express.models.DeliveryBoyModel"%>
<%@page import="warehouse.express.dao.DeliveryBoyDao"%>
<%@page import="warehouse.express.dao.WarehouseDao"%>
<%@page import="warehouse.express.models.WarehouseModel"%>
<%@page import="warehouse.express.models.TrackingModel"%>
<%@page import="warehouse.express.models.StatusList"%>
<%@page import="warehouse.express.dao.OrderDao"%>
<% 
	String productorderId = request.getParameter("productorderId");
	String Status = request.getParameter("Status");
	TrackingModel trackingModel=new TrackingModel();
	String DeliveryBoyId = (String)session.getAttribute("DeliveryBoyId");
	String Name = (String)session.getAttribute("Name");
	trackingModel.setCurrentUserName(Name);
	trackingModel.setCurrentId(DeliveryBoyId);
	trackingModel.setCurrentUser(StatusList.DELIVERY_BOY);
	trackingModel.setCurrentStatus(Status);
	trackingModel.setProductorderId(productorderId);
	
	OrderDao orderDao = new OrderDao();
	orderDao.setStatus(productorderId,Status,StatusList.ORDER_RECEIVED_BY_DELIVERY_BOY,trackingModel,response);
	
	trackingModel=new TrackingModel();
	String BuyerId = request.getParameter("BuyerId");
	BuyerDao buyerDao = new BuyerDao();
	BuyerModel buyerModel = buyerDao.getBuyyer(BuyerId);
	trackingModel.setCurrentUserName(buyerModel.getName());
	trackingModel.setCurrentId(BuyerId);
	trackingModel.setCurrentUser(StatusList.BUYER);
	trackingModel.setCurrentStatus(StatusList.ORDER_RECEIVED_BY_BUYER);
	trackingModel.setProductorderId(productorderId);
	orderDao.setStatus(productorderId,StatusList.ORDER_RECEIVED_BY_BUYER,Status,trackingModel,response);
%>