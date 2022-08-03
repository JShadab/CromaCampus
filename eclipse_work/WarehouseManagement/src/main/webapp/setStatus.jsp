<%@page import="warehouse.express.dao.SellerProductDao"%>
<%
	String SellerProductId=request.getParameter("SellerProductId");
	String Status=request.getParameter("Status");
	
	SellerProductDao sellerProductDao=new SellerProductDao();
	sellerProductDao.getStatus(SellerProductId, Status, response);
%>