
<%@page import="warehouse.express.dao.BuyerDao"%>
<%@page import="warehouse.express.models.BuyerModel"%>
<%
	String Name=request.getParameter("Name");
	String Email=request.getParameter("Email");
	String Phone=request.getParameter("Phone");
	String Password=request.getParameter("Password");
	String LocationId=request.getParameter("LocationId");
	String Address=request.getParameter("Address");
	
	BuyerModel buyerModel=new BuyerModel();
	
	buyerModel.setName(Name);
	buyerModel.setEmail(Email);
	buyerModel.setPhone(Phone);
	buyerModel.setPassword(Password);
	buyerModel.setLocationId(LocationId);
	buyerModel.setAddress(Address);

	BuyerDao buyerDao=new BuyerDao();
	String Status =buyerDao.addBuyer(buyerModel );
	
	 if(Status.equalsIgnoreCase("Add Buyer Registred Successfully")){
			response.sendRedirect("MmessageSuccess.jsp?Msg="+Status);
			
		}else{
			response.sendRedirect("MmessageFailed.jsp?Msg="+Status);
		}
%>>