
<%@page import="java.util.Iterator"%>
<%@page import="warehouse.express.models.LocationModel"%>
<%@page import="java.util.List"%>
<%@page import="warehouse.express.dao.LocationDao"%>
<%
	LocationDao locationDao=new LocationDao();
	List<LocationModel> locationList=locationDao.getLocations();
	Iterator<LocationModel> locationIterator=locationList.iterator();
%>

<%@ include file="Boot.jsp" %>
<div class="row">
	
	<div class="col-md-3"></div>
	<div class="col-md-6">
	 <div class="card p-4 mt-3">
		<form action="BuyerReg1.jsp" method="post">
			<div class="text-center h2">New Buyer Login</div>
			<div class="row">
			<div class="col-md-6">
				<div class="mb-3 mt-3">
						<label for="Name">Name</label>
						<input type="text" id="Name" name="Name" placeholder="Enter Name" required class="form-control">
				</div>
				<div class="mb-3 mt-3">
						<label for="Email">Email</label>
						<input type="Email" id="Email"name="Email" placeholder="Enter Email" required class="form-control">
				</div>
				<div class="mb-3 mt-3">
						<label for="Phone">Phone</label>
						<input type="Number" id="Phone"name="Phone" placeholder="Enter Phone" required class="form-control">
				</div>
					<div class="mb-3 mt-3">
						<label for="Password">Password </label> 
						<input type="Password"id="Password" name="Password" placeholder="Enter Password"required class="form-control">
				</div>
			
			</div>
			<div class="col-md-6">

				<div class="mb-3 mt-3">
						<label for="Address">Add Address</label>
						<textarea name="Address" class="form-control" ></textarea>
					</div>
					<div class="mb-3 mt-3">
						<label for="LocationId">Location </label> 
						<select  name="LocationId" id="LocationId" required class="form-control">
						<%
							while(locationIterator.hasNext()){
								LocationModel locationModel= locationIterator.next();%>
								<option value="<%=locationModel.getLocationId()%>"><%=locationModel.getLocationName()%></option>
							<%}
						%>
						</select>
				</div>
				<div class="mb-3 mt-3">
						<input type="Submit" value="Add Buyer" class="btn btn-primary btn-block mt-3 mb-4" style="width:100%">
				</div>
				
			  
			
			</div>
				
				</div>
				
		</form>
	</div>
	</div>
	</div>