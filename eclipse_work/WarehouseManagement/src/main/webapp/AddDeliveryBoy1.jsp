<%@page import="warehouse.express.dao.DeliveryBoyDao"%>
<%@page import="warehouse.express.models.DeliveryBoyModel"%>
<%@page import="warehouse.express.dao.WarehouseDao"%>
<%@page import="warehouse.express.models.WarehouseModel"%>
<%@ include file="Boot1.jsp" %>
<%
	String Name=request.getParameter("Name");
	String Phone=request.getParameter("Phone");
	String Email=request.getParameter("Email");
	String Password=request.getParameter("Password");
	String WarehouseId=(String)session.getAttribute("WarehouseId");
	String Experience=request.getParameter("Experience");

	
	DeliveryBoyModel deliveryBoyModel=new DeliveryBoyModel();
	
	deliveryBoyModel.setName(Name);
	deliveryBoyModel.setPhone(Phone);
	deliveryBoyModel.setEmail(Email);
	deliveryBoyModel.setPassword(Password);
	deliveryBoyModel.setWarehouseId(WarehouseId);
	deliveryBoyModel.setExperience(Experience);

	
	DeliveryBoyDao deliveryBoyDao=new DeliveryBoyDao();
	String Status =deliveryBoyDao.addDeliveryBoy(deliveryBoyModel );
	
	 if(Status.equalsIgnoreCase("Delivery Boy Added Successfully")){
			response.sendRedirect("WmessageSuccess.jsp?Msg="+Status);
			
		}else{
			response.sendRedirect("WmessageFailed.jsp?Msg="+Status);
		}
	
	
%>>