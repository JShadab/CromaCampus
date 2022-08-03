<%@page import="warehouse.express.dao.WarehouseDao"%>
<%@page import="warehouse.express.models.WarehouseModel"%>
<%@ include file="Boot1.jsp"%>
<%
	String WarehouseName=request.getParameter("WarehouseName");
	String Phone=request.getParameter("Phone");
	String Email=request.getParameter("Email");
	String Password=request.getParameter("Password");
	String ManagerName=request.getParameter("ManagerName");
	String Address=request.getParameter("Address");
	String LocationId=request.getParameter("LocationId");
	
	WarehouseModel warehouseModel=new WarehouseModel();
	
	warehouseModel.setWarehouseName(WarehouseName);
	warehouseModel.setPhone(Phone);
	warehouseModel.setEmail(Email);
	warehouseModel.setPassword(Password);
	warehouseModel.setManagerName(ManagerName);
	warehouseModel.setAddress(Address);
	warehouseModel.setLocationId(LocationId);
	
	WarehouseDao warehouseDao=new WarehouseDao();
	String Status =warehouseDao.addWarehouse(warehouseModel );
	
	 if(Status.equalsIgnoreCase("Add Warehouse Registred Successfully")){
			response.sendRedirect("MmessageSuccess.jsp?Msg="+Status);
			
		}else{
			response.sendRedirect("MmessageFailed.jsp?Msg="+Status);
		}
	
	
%>>