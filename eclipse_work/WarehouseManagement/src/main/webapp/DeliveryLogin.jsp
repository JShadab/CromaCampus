<%@ include file="Boot.jsp" %>
<div class="warehouse-app-deliverylog">
<div class="row">
<div class="col-md-4"></div>
<div class="col-md-4"><br><br><br>
	<div class="card mt-5 p-3">
		<form action="DeliveryLogin1.jsp">
		<div class="text-center h3">Delivery Boy Login</div>
			<div class="form-group">
				<label for="phone">Phone</label>
				<input type="text" id="phone" name="phone" placeholder="Enter Phone Number" required class="form-control">
			</div>
			<div class="form-group">
				<label for="password">Password</label>
				<input type="password" id="password" name="password" placeholder="Enter Password" required class="form-control">
			</div>
			<input type="submit" value="Login" class="btn btn-primary btn-block">
			<br>
			
		</form>
	</div>
</div>
<div class="col-md-4"></div>
</div>
</div>