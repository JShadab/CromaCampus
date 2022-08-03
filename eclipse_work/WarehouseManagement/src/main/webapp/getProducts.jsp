<%@page import="warehouse.express.models.ProductitemModel"%>
<%@page import="warehouse.express.dao.OrderDao"%>
<%@page import="java.util.Iterator"%>
<%@page import="warehouse.express.models.SellerProductModel"%>
<%@page import="warehouse.express.dao.SellerProductDao"%>
<%@page import="java.util.List"%>

<% 
	String CategoryId=request.getParameter("CategoryId");
	String SubcategoryId=request.getParameter("SubcategoryId");
	String ProductName=request.getParameter("ProductName");
	String role=(String)session.getAttribute("role");
	String SellerId = (String)session.getAttribute("SellerId");
	
	SellerProductDao sellerProductDao=new SellerProductDao();
	List<SellerProductModel> sellerproductList=sellerProductDao.getProductsList(CategoryId,SubcategoryId,ProductName,role,SellerId);
	Iterator<SellerProductModel> sellerproductIterator=sellerproductList.iterator();
%>
<div class="row">
	<%while(sellerproductIterator.hasNext()){
		SellerProductModel sellerProductModel = sellerproductIterator.next();%>
		<div class="col-md-3">
			<div class="card">
			  <div class="card-header"><%=sellerProductModel.getProductName()%></div>
			  <div class="card-body">
			  	<div class=""><img src="Pictures/<%=sellerProductModel.getPicture()%>" style="height: 200px;max-width: 100%;"></div>
			  	<div class="mt-3">Brand Name</div>
			  	<div><b><%=sellerProductModel.getBrandName()%></b></div>
			  	<div class="mt-3">Price</div>
			  	<div><b>$ <%=sellerProductModel.getPrice()%></b></div>
			  </div>
			  <div class="card-footer">
			  	<%if(role.equalsIgnoreCase("Seller")){
			  		if(sellerProductModel.getStatus().equalsIgnoreCase("Available")){%>
			  			<form action="setStatus.jsp">
			  				<input type="hidden" name="SellerProductId" value="<%=sellerProductModel.getSellerProductId()%>">
			  				<input type="hidden" name="Status" value="Not Available">
			  				<input type="submit" value="Make as Not Available" class="btn btn-danger">
			  			</form>
			  		<% }else {%>
			  			<form action="setStatus.jsp">
			  				<input type="hidden" name="SellerProductId" value="<%=sellerProductModel.getSellerProductId()%>">
			  				<input type="hidden" name="Status" value="Available">
			  				<input type="submit" value="Make as Available" class="btn btn-success">
			  			</form>
			  		<% }%>
			  	<%}%>
			  	<%if(role.equalsIgnoreCase("Buyer")){
			  		OrderDao orderDao = new OrderDao();
			  		ProductitemModel productitemModel= orderDao.getProductItem(sellerProductModel.getSellerId(),(String)session.getAttribute("BuyerId"),sellerProductModel.getSellerProductId());
			  	%>
			  			<form action="addCart.jsp">
			  				<div class="row">
			  					<div class="col-md-6">
			  						<input type="hidden" name="SellerProductId" value="<%=sellerProductModel.getSellerProductId()%>">
			  						<input type="hidden" name="SellerId" value="<%=sellerProductModel.getSellerId()%>">
			  						<input type="hidden" name="Price" value="<%=sellerProductModel.getPrice()%>">
					  				<div class="mb-3 mt-3">
										<label for="Quantity" class="form-label">Quantity</label>
										<input type="number" name="Quantity" class="form-control" id="Quantity" value="<%=productitemModel.getQuantity()%>" placeholder="Enter Quantity" required>
									</div>
			  					</div>
			  					<div class="col-md-6 mt-5">
			  						<input type="submit" value="Add To Cart" class="btn btn-info">
			  					</div>
			  				</div>
			  			</form>
			  	<%}%>
			  </div>
			</div>
		</div>
	<%} %>
</div>