<%@page import="warehouse.express.models.SubcategoryModel"%>
<%@page import="warehouse.express.dao.SubcategoryDao"%>
<%@page import="warehouse.express.models.CategoryModel"%>
<%@page import="warehouse.express.dao.CategoryDao"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>


<% 
	String role=(String)session.getAttribute("role");
	if(role.equalsIgnoreCase("Seller")){%>
		<%@ include file="Boot2.jsp" %>
		
	<%}else if(role.equalsIgnoreCase("Buyer")){ %>
		<%@ include file="Boot3.jsp" %>
		
	<%}%>


<script>
$(document).ready(function(){
	getMedicines();
	$("#CategoryId").on("change",()=>{
		getMedicines();
	})
	$("#SubcategoryId").on("change",()=>{
		getMedicines();
	})
	$("#ProductName").on("keyup",()=>{
		getMedicines();
	})
	
});
function getMedicines(){
	console.log($("#SubcategoryId").val());
	 $.get("getProducts.jsp?CategoryId="+$("#CategoryId").val()+"&SubcategoryId="+$("#SubcategoryId").val()+"&ProductName="+$("#ProductName").val(), function(data, status){
	      $("#products").html(data)
	 });
}
</script>

<%
	
	CategoryDao categoryDao=new CategoryDao();
	List<CategoryModel> categoryList=categoryDao.getCategory();
	Iterator<CategoryModel> categoryIterator=categoryList.iterator();
%>
<%
	SubcategoryDao subcategoryDao=new SubcategoryDao();
	List<SubcategoryModel> subcategoryList=subcategoryDao.getSubcategory();
	Iterator<SubcategoryModel> subcategoryIterator=subcategoryList.iterator();
%>
<div class="container">
<div class="row mt-3" >
	<div class="col-md-12"> 
	  	<form action=" "method="post">
	  	<div class="row">
	  	<div class="col-md-4">
	  	<div class="mb-3 mt-3">
	  	
		 <label for="CategoryId">Category</label> 
			<select id="CategoryId" required class="form-control" name="CategoryId"> 
			<option value="all">All Categories</option>
			<%
				while(categoryIterator.hasNext()){
				CategoryModel categoryModel= categoryIterator.next();%>
				<option value="<%=categoryModel.getCategoryId()%>"><%=categoryModel.getCategoryName()%></option>
			<%}%>	
			</select>
		</div>
		</div>
		<div class="col-md-4">
		<div class="mb-3 mt-3">
		 <label for="SubcategoryId">Sub Category</label> 
			<select id="SubcategoryId" required class="form-control" name="SubcategoryId"> 
			<option value="all">All SubCategories</option>
			<%
				while(subcategoryIterator.hasNext()){
					SubcategoryModel subcategoryModel= subcategoryIterator.next();%>
				<option value="<%=subcategoryModel.getSubcategoryId()%>"><%=subcategoryModel.getSubcategoryName()%></option>
			<%}%>		
			</select>
		</div>
		</div>
		<div class="col-md-4">
		<div class="mb-3 mt-3">
			<label for="ProductName">Product Name</label>
			<input type="text" id="ProductName" name="ProductName" placeholder="Enter Product Name" value="all" required class="form-control">
		</div>
		</div>
		</div>
		</form>
	  </div>
</div>
</div>
<div id="products">
</div>

