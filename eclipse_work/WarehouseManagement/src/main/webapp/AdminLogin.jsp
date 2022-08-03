<%@ include file="Boot.jsp" %>
<div class="doctor-app-inda">
<div class="row" style="background-image: url('images/f.webp');height: 100vh;background-size: cover;">
<div class="col-md-6"></div>
<div class="col-md-6 p-5"><br><br><br>
	<div class="card  p-3">
		<form action="AdminLogin1.jsp" method="post">
		<div class="text-center h3">Administrator Login</div>
			<div class="form-group">
				<label for="Username">User Name</label>
				<input type="text" id="Username" name="Username" placeholder="Enter User Name" required class="form-control">
			</div>
			<div class="form-group">
				<label for="password">Password</label>
				<input type="password" id="password" name="password" placeholder="Enter Password" required class="form-control">
			</div>
			<input type="submit" value="Login" class="btn btn-primary btn-block">
		</form>
	</div>
</div>
</div>
</div>