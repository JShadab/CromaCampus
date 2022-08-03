<%@ include file="Boot2.jsp"%>
<div class="warehouse-app-addc">
<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-4"> 
	<div class="card p-4 mt-4">
	  	<form action="AddCategory1.jsp" method="post">
	  	<div class="text-center h3">Add category</div>
			<div class="mb-3 mt-3">
				<label for="CategoryName" class="form-label">Category Name</label>
				<input type="text" name="CategoryName" class="form-control" id="CategoryName" placeholder="Enter Category Name" required>
			</div>
			<div>
				<input type="Submit" value="Add" class="btn btn-primary"  style="width: 100%;">
			</div>
		</form>
		</div>
	  </div>
</div>
</div>