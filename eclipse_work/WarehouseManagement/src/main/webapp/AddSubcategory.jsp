<%@page import="java.util.Iterator"%>
<%@page import="warehouse.express.models.CategoryModel"%>
<%@page import="java.util.List"%>
<%@page import="warehouse.express.dao.CategoryDao"%>

<%
	CategoryDao categoryDao=new CategoryDao();
	List<CategoryModel> categoryList=categoryDao.getCategory();
	Iterator<CategoryModel> categoryIterator=categoryList.iterator();
%>

<%@ include file="Boot2.jsp" %>
<div class="row">
	
	<div class="col-md-3"></div>
	<div class="col-md-6">
	 <div class="card p-4 mt-3">
		<form action="Addsubcategory1.jsp" method="post">
			<div class="text-center h2">Add Sub Category</div>
			<div class="row">
			<div class="col-md-12">
				<div class="mb-3 mt-3">
						<label for="SubcategoryName">Sub Category Name</label>
						<input type="text" id="SubcategoryName" name="SubcategoryName" placeholder="Enter Sub Category Name" required class="form-control">
				</div>
					<div class="mb-3 mt-3">
						<label for="CategoryId">Category</label> 
						<select  name="CategoryId" id="CategoryId" required class="form-control">
						<%
							while(categoryIterator.hasNext()){
								CategoryModel categoryModel= categoryIterator.next();%>
								<option value="<%=categoryModel.getCategoryId()%>"><%=categoryModel.getCategoryName()%></option>
							<%}%>
						
						</select>
				</div>
				<div class="mb-3 mt-3">
						<input type="Submit" value="Add Sub Category" class="btn btn-primary btn-block mt-3 mb-4" style="width:100%">
				</div>
				
			  	</div>
			</div>	
		</form>
	</div>
	</div>
	</div>