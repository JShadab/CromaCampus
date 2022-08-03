
<%@page import="warehouse.express.dao.SubcategoryDao"%>
<%@page import="warehouse.express.models.SubcategoryModel"%>


<%
		String SubcategoryName=request.getParameter("SubcategoryName");
		String CategoryId=request.getParameter("CategoryId");
		
		SubcategoryModel subcategoryModel=new SubcategoryModel();
		
		subcategoryModel.setCategoryId(CategoryId);
		subcategoryModel.setSubcategoryName(SubcategoryName);
		
		SubcategoryDao subcategoryDao=new SubcategoryDao();	
		String Status = subcategoryDao.addSubcategory(subcategoryModel);
		
		 if(Status.equalsIgnoreCase("Sub Category Added Successfully")){
			response.sendRedirect("SmessageSuccess.jsp?Msg="+Status);		
		}else{
				response.sendRedirect("SmessageFailed.jsp?Msg="+Status);
		}
%>