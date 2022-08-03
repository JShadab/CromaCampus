
<%@ include file="Boot4.jsp" %>
<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-4">
	 <div class="card p-4 mt-3">
	 	<div class="h4 text-center">Add New Delivery Boy</div>
		<form action="AddDeliveryBoy1.jsp" method="post">
				<div class="mb-3 mt-3">
						<label for="Name">Delivery Boy Name</label>
						<input type="text" id="Name" name="Name" placeholder="Enter Name" required class="form-control">
				</div>
				<div class="mb-3 mt-3">
						<label for="Phone">Phone</label>
						<input type="Number" id="Phone"name="Phone" placeholder="Enter Phone" required class="form-control">
				</div>
				<div class="mb-3 mt-3">
						<label for="Email">Email</label>
						<input type="Email" id="Email"name="Email" placeholder="Enter Email" required class="form-control">
				</div>
			   <div class="mb-3 mt-3">
						<label for="Password">Password </label> 
						<input type="Password"id="Password" name="Password" placeholder="Enter Password"required class="form-control">
				</div>
				<div class="mb-3 mt-3">
						<label for="Experience">Experience </label>
						<input type="text" id="Experience"name="Experience" placeholder="Enter Experience" required class="form-control">
				</div>
				<div class="mb-3 mt-3">
						<input type="Submit" value="Add Delivery Boy" class="btn btn-primary btn-block mt-3 mb-4" style="width:100%">
				</div>
		</form>
	</div>
	</div>
	</div>