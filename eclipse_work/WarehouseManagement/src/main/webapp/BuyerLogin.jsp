<%@ include file="Boot.jsp" %>
<div class="warehouse-app-byr">
<div class="row">
<div class="col-md-4"></div>
<div class="col-md-4"><br><br><br>
	<div class="card mt-5 p-3">
		<form action="BuyerLogin1.jsp" method="post">
		<div class="text-center h3">Buyer Login</div>
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
			<div class="text-center"><a href="BuyerReg.jsp">Click Here to New Buyer Register</a></div>
		</form>
	</div>
</div>
<div class="col-md-4"></div>
</div>
</div>
