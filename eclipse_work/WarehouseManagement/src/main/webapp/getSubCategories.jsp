<%@page import="warehouse.express.models.SubcategoryModel"%>
<%@page import="warehouse.express.dao.SubcategoryDao"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>

<option value="">Choose Sub Category</option>
<%
	String CategoryId = request.getParameter("CategoryId");
	System.out.print(CategoryId);
	SubcategoryDao subcategoryDao = new SubcategoryDao();
	List<SubcategoryModel> subCategoryList= subcategoryDao.getSubcategory(CategoryId);
	Iterator<SubcategoryModel> subCategoryIterator = subCategoryList.iterator();
	while(subCategoryIterator.hasNext()){
		SubcategoryModel subcategoryModel = subCategoryIterator.next();%>
		<option value="<%=subcategoryModel.getSubcategoryId()%>"><%=subcategoryModel.getSubcategoryName()%></option>	
	<%}
%>
