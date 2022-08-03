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
	String WarehouseId = (String)session.getAttribute("WarehouseId");
	String WarehouseName = (String)session.getAttribute("WarehouseName");
	trackingModel.setCurrentUserName(WarehouseName);
	trackingModel.setCurrentId(WarehouseId);
	trackingModel.setCurrentUser(StatusList.WAREHOUSE);
	trackingModel.setCurrentStatus(Status);
	trackingModel.setProductorderId(productorderId);
	
	OrderDao orderDao = new OrderDao();
	orderDao.setStatus(productorderId,Status,StatusList.ORDER_RECEIVED_BY_WAREHOUSE,trackingModel,response);
	
	trackingModel=new TrackingModel();
	String DeliveryBoyId = request.getParameter("DeliveryBoyId");
	DeliveryBoyDao deliveryBoyDao = new DeliveryBoyDao();
	DeliveryBoyModel deliveryBoyModel = deliveryBoyDao.getDeliveryBoy(DeliveryBoyId);
	trackingModel.setCurrentUserName(deliveryBoyModel.getName());
	trackingModel.setCurrentId(DeliveryBoyId);
	trackingModel.setCurrentUser(StatusList.DELIVERY_BOY);
	trackingModel.setCurrentStatus(StatusList.ORDER_RECEIVED_BY_DELIVERY_BOY);
	trackingModel.setProductorderId(productorderId);
	orderDao.setStatus(productorderId,StatusList.ORDER_RECEIVED_BY_DELIVERY_BOY,Status,trackingModel,response);
%>