<%@page import="warehouse.express.dao.CategoryDao"%>
<%@page import="warehouse.express.models.CategoryModel"%>

<% 
	String CategoryName=request.getParameter("CategoryName");
	
	
	CategoryModel categoryModel=new CategoryModel();
	categoryModel.setCategoryName(CategoryName);
	CategoryDao categoryDao=new CategoryDao();
	
	String Status=categoryDao.addCategory(categoryModel);
	
	 if(Status.equalsIgnoreCase("Category Added Successfully")){
			response.sendRedirect("SmessageSuccess.jsp?Msg="+Status);
			
		}else{
			response.sendRedirect("SmessageFailed.jsp?Msg="+Status);
		}

%>