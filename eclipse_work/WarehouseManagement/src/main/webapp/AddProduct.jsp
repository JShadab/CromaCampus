<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="warehouse.express.dao.CategoryDao"%>
<%@page import="warehouse.express.models.CategoryModel"%>
<%@ include file="Boot2.jsp" %>

<script>
$(document).ready(function(){
	$("#CategoryId").on("change",()=>{
		getSubcategories();
	})	
});
function getSubcategories(){
	console.log($("#SubcategoryId").val());
	 $.get("getSubCategories.jsp?CategoryId="+$("#CategoryId").val(), function(data, status){
	      $("#SubcategoryId").html(data)
	 });
}
</script>
<%
	CategoryDao categoryDao=new CategoryDao();
	List<CategoryModel> categoryList=categoryDao.getCategory();
	Iterator<CategoryModel> categoryIterator=categoryList.iterator();
%>
<div class="row">
	<div class="col-md-3"></div>
	<div class="col-md-6">
	 <div class="card p-4 mt-3">
		<form action="AddProduct1.jsp" method="post" enctype="multipart/form-data">
			<div class="text-center h2">Add Product</div>
			<div class="row">
			<div class="col-md-6">
				<div class="mb-3 mt-3">
						<label for="ProductName">Product Name</label>
						<input type="text" id="ProductName" name="ProductName" placeholder="Enter Product Name" required class="form-control">
				</div>
				<div class="mb-3 mt-3">
						<label for="CategoryId">Category </label> 
						<select  name="CategoryId" id="CategoryId" required class="form-control">
						<option value="">Choose Category</option>
						<%
							while(categoryIterator.hasNext()){
								CategoryModel categoryModel= categoryIterator.next();%>
								<option value="<%=categoryModel.getCategoryId()%>"><%=categoryModel.getCategoryName()%></option>
							<%}%>
						</select>
				</div>
				<div class="mb-3 mt-3">
						<label for="SubcategoryId">Sub Category </label> 
						<select  name="SubcategoryId" id="SubcategoryId" required class="form-control">
						<option value="">Choose Sub Category</option>
						</select>
				</div>
				<div class="mb-3 mt-3">
						<label for="Price">Price</label>
						<input type="Number" id="Price"name="Price" placeholder="Enter Price" required class="form-control">
				</div>
			</div>
			<div class="col-md-6">
					<div class="mb-3 mt-3">
						<label for="Picture">Upload Picture</label> 
						<input type="file"id="Picture" name="Picture" required class="form-control">
					</div>
						<div class="mb-3 mt-3">
						<label for="BrandName">Brand Name</label> 
						<input type="text"id="BrandName" name="BrandName" placeholder="Enter Brand Name"required class="form-control">
				  </div> 
				  <div class="mb-3 mt-3">
					<label for="Description">Product Description</label>
					<textarea id="Description" name="Description" placeholder="Enter Description" required class="form-control"></textarea>
				</div>
				<div class="mb-3 mt-3">
					   <input type="Submit" value="Add Product" class="btn btn-primary btn-block mt-3 mb-4" style="width:100%">
				</div>
				</div>
			</div>
		</form>
	</div>
	</div>
	</div>
