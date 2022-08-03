	<%@ include file="Boot3.jsp" %>
<% 
	String productorderId = request.getParameter("productorderId");
	String total = request.getParameter("total");
%>
<div class="row">
	<div class="col-md-8">
	
	</div>
	<div class="col-md-4 mt-5">
		<div class="card p-3">
		<form action="orderNow1.jsp">
			<input type="hidden" name="productorderId" value="<%=productorderId%>">
			 <input type="hidden" name="total" value="<%=total%>">
			<div class="h4 text-center">Payable Amount $ <%=total %></div>
			<div class="mb-3 mt-3">
				<label for="cardNumber" class="form-label">Card Number</label>
				<input type="text" name="cardNumber" class="form-control" id="cardNumber" placeholder="Enter Card Number" required>
			</div>
			<div class="mb-3 mt-3">
				<label for="Name" class="form-label">Name On Card</label>
				<input type="text" name="Name" class="form-control" id="Name" placeholder="Enter Name on Card" required>
			</div>
			<div class="mb-3 mt-3">
				<label for="ExpireDate" class="form-label">Expire Date</label>
				<input type="text" name="ExpireDate" class="form-control" id="ExpireDate" placeholder="Enter Expire Date" required>
			</div>
			<div class="mb-3 mt-3">
				<label for="cvv" class="form-label">CVV</label>
				<input type="text" name="cvv" class="form-control" id="cvv" placeholder="Enter CVV" required>
			</div>
			<div>
				<input type="Submit" value="Proceed" class="btn btn-primary"  style="width: 100%;">
			</div>
			</form>
		</div>
	</div>
</div>