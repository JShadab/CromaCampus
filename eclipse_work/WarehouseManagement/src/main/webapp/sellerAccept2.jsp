<%@page import="warehouse.express.dao.WarehouseDao"%>
<%@page import="warehouse.express.models.WarehouseModel"%>
<%@page import="warehouse.express.models.TrackingModel"%>
<%@page import="warehouse.express.models.StatusList"%>
<%@page import="warehouse.express.dao.OrderDao"%>
<% 
	String productorderId = request.getParameter("productorderId");
	String Status = request.getParameter("Status");
	TrackingModel trackingModel=new TrackingModel();
	String SellerId = (String)session.getAttribute("SellerId");
	String Name = (String)session.getAttribute("Name");
	trackingModel.setCurrentUserName(Name);
	trackingModel.setCurrentId(SellerId);
	trackingModel.setCurrentUser(StatusList.SELLER);
	trackingModel.setCurrentStatus(Status);
	trackingModel.setProductorderId(productorderId);
	
	OrderDao orderDao = new OrderDao();
	orderDao.setStatus(productorderId,Status,StatusList.ORDERED,trackingModel,response);
	
	trackingModel=new TrackingModel();
	String WarehouseId = request.getParameter("WarehouseId");
	WarehouseDao warehouseDao = new WarehouseDao();
	WarehouseModel warehouseModel = warehouseDao.getWareHouse(WarehouseId);
	trackingModel.setCurrentUserName(warehouseModel.getWarehouseName()+" ( "+warehouseModel.getManagerName()+" )");
	trackingModel.setCurrentId(WarehouseId);
	trackingModel.setCurrentUser(StatusList.WAREHOUSE);
	trackingModel.setCurrentStatus(StatusList.ORDER_RECEIVED_BY_WAREHOUSE);
	trackingModel.setProductorderId(productorderId);
	orderDao.setStatus(productorderId,StatusList.ORDER_RECEIVED_BY_WAREHOUSE,Status,trackingModel,response);
%>