<%@page import="warehouse.express.dao.SellerDao"%>
<%@page import="warehouse.express.models.SellerModel"%>
<%
	String Name=request.getParameter("Name");
	String Email=request.getParameter("Email");
	String Phone=request.getParameter("Phone");
	String Password=request.getParameter("Password");
	String Tin=request.getParameter("Tin");
	String LocationId=request.getParameter("LocationId");
	String Address=request.getParameter("Address");
	
	SellerModel sellerModel=new SellerModel();
	
	sellerModel.setName(Name);
	sellerModel.setEmail(Email);
	sellerModel.setPhone(Phone);
	sellerModel.setPassword(Password);
	sellerModel.setTin(Tin);
	sellerModel.setLocationId(LocationId);
	sellerModel.setAddress(Address);

	SellerDao sellerDao=new SellerDao();
	String Status =sellerDao.addSeller(sellerModel );
	
	 if(Status.equalsIgnoreCase("Add Seller Registred Successfully")){
			response.sendRedirect("MmessageSuccess.jsp?Msg="+Status);
			
		}else{
			response.sendRedirect("MmessageFailed.jsp?Msg="+Status);
		}
%>>