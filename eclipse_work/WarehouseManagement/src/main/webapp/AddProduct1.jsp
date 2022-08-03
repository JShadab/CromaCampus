<%@page import="warehouse.express.dao.SellerProductDao"%>
<%@page import="warehouse.express.models.SellerProductModel"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<% 
	String path=application.getRealPath("Pictures");
	MultipartRequest Multi=new MultipartRequest(request,path);
	
	String SellerId=(String)session.getAttribute("SellerId");
	
	String ProductName=Multi.getParameter("ProductName");
	String CategoryId=Multi.getParameter("CategoryId");
	String SubcategoryId=Multi.getParameter("SubcategoryId");
	String Price=Multi.getParameter("Price");
	String Picture=Multi.getFilesystemName("Picture");
	String BrandName=Multi.getParameter("BrandName");
	String Description=Multi.getParameter("Description");
	
	SellerProductModel sellerProductModel=new SellerProductModel();
	sellerProductModel.setProductName(ProductName);
	sellerProductModel.setCategoryId(CategoryId);
	sellerProductModel.setSubcategoryId(SubcategoryId);
	sellerProductModel.setPrice(Price);
	sellerProductModel.setPicture(Picture);
	sellerProductModel.setBrandName(BrandName);
	sellerProductModel.setDescription(Description);
	sellerProductModel.setSellerId(SellerId);
	
	SellerProductDao sellerProductDao=new SellerProductDao();
	String responseStatus = sellerProductDao.addProduct(sellerProductModel);
	
	if(responseStatus.equalsIgnoreCase("Product Added Successfully")){
		response.sendRedirect("SmessageSuccess.jsp?Msg="+responseStatus);
		
	}else{
		response.sendRedirect("SmessageFailed.jsp?Msg="+responseStatus);
	}
%>