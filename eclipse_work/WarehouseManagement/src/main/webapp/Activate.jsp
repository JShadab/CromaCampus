<%@page import="warehouse.express.dao.SellerDao"%>
<%
	String SellerId=request.getParameter("SellerId");
	String Status=request.getParameter("Status");
	
	SellerDao sellerDao=new SellerDao();
	sellerDao.ActivateorDeactivate(SellerId, Status, response);
	
%>