<%@page import="java.util.Collections"%>
<%@page import="warehouse.express.models.DeliveryBoyModel"%>
<%@page import="warehouse.express.dao.DeliveryBoyDao"%>
<%@page import="warehouse.express.dao.WarehouseDao"%>
<%@page import="warehouse.express.models.WarehouseModel"%>
<%@page import="warehouse.express.models.TrackingModel"%>
<%@page import="warehouse.express.models.ProductitemModel"%>
<%@page import="java.util.Iterator"%>
<%@page import="warehouse.express.models.ProductorderModel"%>
<%@page import="java.util.List"%>
<%@page import="warehouse.express.dao.OrderDao"%>
<% String role = (String)session.getAttribute("role");
	String SellerId = null;
	String WarehouseId= null;
	String BuyerId = null;
	String DeliveryBoyId = null;
	if(role.equalsIgnoreCase("Seller")){
		SellerId = (String)session.getAttribute("SellerId");%>
		<%@ include file="Boot2.jsp" %>
	<% } else if(role.equalsIgnoreCase("Buyer")){
		BuyerId = (String)session.getAttribute("BuyerId");%>
		<%@ include file="Boot3.jsp" %>
	<% } else if(role.equalsIgnoreCase("Warehouse")){
		WarehouseId = (String)session.getAttribute("WarehouseId");%>
		<%@ include file="Boot4.jsp" %>
	<% } else if(role.equalsIgnoreCase("Deliveryboy")){
		DeliveryBoyId = (String)session.getAttribute("DeliveryBoyId");%>
		<%@ include file="Boot5.jsp" %>
	<% }%>
<% 
	String Status = request.getParameter("Status");
	OrderDao orderDao = new OrderDao();
	List<ProductorderModel> productorderModelList = orderDao.getOrders(role,SellerId,BuyerId,WarehouseId,DeliveryBoyId,Status);
	Collections.reverse(productorderModelList);
	Iterator<ProductorderModel> ProductordeIterator = productorderModelList.iterator();
%>
<div class="container">
		<% if(productorderModelList.size()==0){%>
				<div class="text-center h4 mt-5">No Orders Available to Show</div>
			<%}%>
	<%while(ProductordeIterator.hasNext()){
		ProductorderModel productorderModel = ProductordeIterator.next();
		float total = 0;
		%>
		<div class="card mt-5">
		  <div class="card-header">
		  	<div class="row">
		  		<div class="col-md-2">
		  			<div class="text-muted">Order Id</div>
		  			<div class="text-info fw-bold"><%=productorderModel.getProductorderId()%></div>
		  		</div>
		  		<div class="col-md-3">
		  			<div class="text-muted">Seller</div>
		  			<div class="text-info fw-bold"><%=productorderModel.getSellerModel().getName()%></div>
		  		</div>
		  		<div class="col-md-3">
		  			<div class="text-muted">Buyer</div>
		  			<div class="text-info fw-bold"><%=productorderModel.getBuyerModel().getName()%></div>
		  		</div>
		  		<div class="col-md-2">
		  			<div class="text-muted">Status</div>
		  			<div class="text-info fw-bold"><%=productorderModel.getStatus()%></div>
		  		</div>
		  		<div class="col-md-2">
		  			<div class="text-muted">Date</div>
		  			<div class="text-info fw-bold"><%=productorderModel.getCurrentDate()%></div>
		  		</div>
		  	</div>
		  </div>
		  <div class="card-body">
		  	<%
		  		List<ProductitemModel> productitemModelList = orderDao.getProductItemList(productorderModel.getProductorderId());
		  		Iterator<ProductitemModel> productitemIterator = productitemModelList.iterator();
		  	%>
		  	<table class="table table-bordered">
		  		<tr>
		  			<th>Picture</th>
		  			<th>Product</th>
		  			<th>Brand</th>
		  			<th>Price</th>
		  			<th>Quantity</th>
		  			<th>Total</th>
		  			<%if(role.equalsIgnoreCase("Buyer")&&Status.equalsIgnoreCase(StatusList.CART)){%>
		  				<th>Remove</th>
		  			<% }%>
		  		</tr>
		  		<%while(productitemIterator.hasNext()){
		  			ProductitemModel productitemModel = productitemIterator.next();
		  			float sum = (Integer.parseInt(productitemModel.getQuantity())) * (Float.parseFloat(productitemModel.getPrice()));
		  			total = total+sum;
		  			%>
		  			<tr>
		  				<td><img src="Pictures/<%=productitemModel.getSellerProductModel().getPicture()%>" style="height: 70px; max-width: 100%;"></td>
		  				<td><%=productitemModel.getSellerProductModel().getProductName()%></td>
		  				<td><%=productitemModel.getSellerProductModel().getBrandName()%></td>
		  				<td>$ <%=productitemModel.getPrice()%></td>
		  				<td><%=productitemModel.getQuantity()%></td>
		  				<td>$ <%=sum %></td>
		  				<%if(role.equalsIgnoreCase("Buyer")&&Status.equalsIgnoreCase(StatusList.CART)){%>
		  					<td>
			  					<form action="removeCart.jsp" method="post">
					  				<input type="hidden" name="ProductitemId" value="<%=productitemModel.getProductitemId()%>">
					  				<input type="hidden" name="productorderId" value="<%=productitemModel.getProductorderId()%>">
					  				<input type="hidden" name="Status" value="Available">
					  				<input type="submit" value="Remove" class="btn btn-danger">
				  				</form>
			  				</td>
		  				<% }%>
		  			</tr>
		  	<% } %>
		  	<tr><td colspan="4"></td><td>Total</td><td>$ <%=total%></td></tr>
		  	</table>
		  </div>
		  <div class="card-footer">
		  <%
		  	List<TrackingModel> trackingModelList = orderDao.getTrackings(productorderModel.getProductorderId());
		  	Iterator<TrackingModel> trackingIterator = trackingModelList.iterator();%>
		  	<table class="table table-bordered">
		  	<%if(trackingModelList.size()>0){%>
		  		<tr>
		  			<th>Action Role</th>
		  			<th>Action By</th>
		  			<th>Action</th>
		  			<th>Date</th>
		  		</tr>
		  	<%}
		  	while(trackingIterator.hasNext()){
		  		TrackingModel trackingModel = trackingIterator.next();%>
		  		<tr>
		  			<td><%=trackingModel.getCurrentUser()%></td>
		  			<td><%=trackingModel.getCurrentUserName()%></td>
		  			<td><%=trackingModel.getCurrentStatus()%></td>
		  			<td><%=trackingModel.getCurrentDate()%></td>
		  		</tr>
		  	<%} %>
		  	</table>
		  	<% if(role.equalsIgnoreCase("Seller")){				
		  		if(productorderModel.getStatus().equalsIgnoreCase(StatusList.ORDERED)){%>
		  			<div class="row">
		  				<div class="col-md-6"></div>
		  				<div class="col-md-3">
		  					<form action="sellerAccept.jsp" method="post">
				  				<input type="hidden" name="productorderId" value="<%=productorderModel.getProductorderId()%>">
				  				<input type="hidden" name="Status" value="<%=StatusList.ORDER_ACCEPTED%>">
				  				<input type="submit" value="Accept" class="btn btn-success btn-block">
			  				</form>
		  				</div>
		  				<div class="col-md-3">
		  					<form action="sellerAccept.jsp" method="post">
				  				<input type="hidden" name="productorderId" value="<%=productorderModel.getProductorderId()%>">
				  				<input type="hidden" name="Status" value="<%=StatusList.ORDER_REJECTED%>">
				  				<input type="submit" value="Reject" class="btn btn-danger btn-block">
			  				</form>
		  				</div>
	  				</div>
		  		<% } else if(productorderModel.getStatus().equalsIgnoreCase(StatusList.ORDER_ACCEPTED)){
		  			WarehouseDao warehouseDao=new WarehouseDao();
		  			List<WarehouseModel> warehouseModelList = warehouseDao.ViewWarehouse(productorderModel.getSellerModel().getLocationId());
		  			Iterator<WarehouseModel> warehouseIterator = warehouseModelList.iterator();
		  		%>
		  		<div class="text-right">
		  			<form action="sellerAccept2.jsp" method="post">
		  			<div class="row">
		  				<div class="col-md-4 mt-3">
		  					<label for="WarehouseId">Choose Warehouse</label> 
		  				</div>
		  				<div class="col-md-4">
		  					<input type="hidden" name="productorderId" value="<%=productorderModel.getProductorderId()%>">
		  					<input type="hidden" name="Status" value="<%=StatusList.ORDER_DISPATCHED_TO_WAREHOUSE%>">
		  					<div class="mb-3 mt-3">
									<select  name="WarehouseId" id="WarehouseId" required class="form-control">
									<%
										while(warehouseIterator.hasNext()){
											WarehouseModel warehouseModel= warehouseIterator.next();%>
											<option value="<%=warehouseModel.getWarehouseId()%>"><%=warehouseModel.getWarehouseName()%></option>
										<%}%>
									
									</select>
							</div>
		  				</div>
		  				<div class="col-md-4 mt-3">
		  					<input type="submit" <%if(warehouseModelList.size()==0){out.print("disabled");}%> value="<%=StatusList.ORDER_DISPATCHED_TO_WAREHOUSE%>" class="btn btn-info btn-block">
		  				</div>
		  			</div>			
			  		</form>
		  		</div>
		  		<%} 
		  	} else if(role.equalsIgnoreCase("Buyer")){
				if(productorderModel.getStatus().equalsIgnoreCase(StatusList.CART)){%>
		  			<div class="text-right">
			  			<form action="orderNow.jsp" method="post">
			  				<input type="hidden" name="productorderId" value="<%=productorderModel.getProductorderId()%>">
			  				<input type="hidden" name="total" value="<%=total%>">
			  				<input type="submit" value="Order Now" class="btn btn-success">
		  				</form>
	  				</div>
		  		<% }
			   } else if(role.equalsIgnoreCase("Warehouse")){
			   if(productorderModel.getStatus().equalsIgnoreCase(StatusList.ORDER_RECEIVED_BY_WAREHOUSE)){
					if(productorderModel.getBuyerModel().getLocationId().equalsIgnoreCase((String)session.getAttribute("LocationId"))){
						DeliveryBoyDao deliveryBoyDao = new DeliveryBoyDao();
						List<DeliveryBoyModel> deliveryBoyModelList = deliveryBoyDao.ViewDeliveryBoy(WarehouseId);
						Iterator<DeliveryBoyModel> deliveryBoyIterator =deliveryBoyModelList.iterator();
						%>
						<form action="wareHouserAccept.jsp" method="post">
			  			<div class="row">
			  				<div class="col-md-4 mt-3">
			  					<label for="DeliveryBoyId">Choose Delivery Boy</label> 
			  				</div>
			  				<div class="col-md-4">
			  					<input type="hidden" name="productorderId" value="<%=productorderModel.getProductorderId()%>">
			  					<input type="hidden" name="Status" value="<%=StatusList.ORDER_ASSIGNED_TO_DELIVERY_BOY%>">
			  					<div class="mb-3 mt-3">
									<select  name="DeliveryBoyId" id="DeliveryBoyId" required class="form-control">
										<%
											while(deliveryBoyIterator.hasNext()){
												DeliveryBoyModel deliveryBoyModel= deliveryBoyIterator.next();%>
												<option value="<%=deliveryBoyModel.getDeliveryBoyId()%>"><%=deliveryBoyModel.getName()%></option>
										<%}%>
										
									</select>
								</div>
		  				</div>
		  				<div class="col-md-4 mt-3">
		  					<input type="submit" <%if(deliveryBoyModelList.size()==0){out.print("disabled");}%> value="<%=StatusList.ORDER_ASSIGNED_TO_DELIVERY_BOY%>" class="btn btn-info btn-block">
		  				</div>
		  			</div>			
			  		</form>
					<%} else if(productorderModel.getCurrentId().equalsIgnoreCase(WarehouseId)) {
						
						WarehouseDao warehouseDao=new WarehouseDao();
			  			List<WarehouseModel> warehouseModelList = warehouseDao.ViewWarehouse(productorderModel.getBuyerModel().getLocationId());
			  			Iterator<WarehouseModel> warehouseIterator = warehouseModelList.iterator();
			  		%>
			  		<div class="text-right">
			  			<form action="warehouseAccept.jsp" method="post">
			  			<div class="row">
			  				<div class="col-md-4 mt-3">
			  					<label for="WarehouseId">Choose Warehouse</label> 
			  				</div>
			  				<div class="col-md-4">
			  					<input type="hidden" name="productorderId" value="<%=productorderModel.getProductorderId()%>">
			  					<input type="hidden" name="Status" value="<%=StatusList.ORDER_DISPATCHED_TO_WAREHOUSE%>">
			  					<div class="mb-3 mt-3">
										<select  name="WarehouseId" id="WarehouseId" required class="form-control">
										<%
											while(warehouseIterator.hasNext()){
												WarehouseModel warehouseModel= warehouseIterator.next();%>
												<option value="<%=warehouseModel.getWarehouseId()%>"><%=warehouseModel.getWarehouseName()%></option>
											<%}%>
										
										</select>
								</div>
			  				</div>
			  				<div class="col-md-4 mt-3">
			  					<input type="submit" <%if(warehouseModelList.size()==0){out.print("disabled");}%> value="<%=StatusList.ORDER_DISPATCHED_TO_WAREHOUSE%>" class="btn btn-info btn-block">
			  				</div>
			  			</div>			
				  		</form>
			  		</div>
						
					<%}%>
				<%}} else if(role.equalsIgnoreCase("Deliveryboy")){
					if(productorderModel.getStatus().equalsIgnoreCase(StatusList.ORDER_RECEIVED_BY_DELIVERY_BOY)){
				%>
					<div class="text-right">
			  			<form action="orderDeliver.jsp" method="post">
			  				<input type="hidden" name="productorderId" value="<%=productorderModel.getProductorderId()%>">
			  				<input type="hidden" name="BuyerId" value="<%=productorderModel.getBuyerId()%>">
			  				<input type="hidden" name="Status" value="<%=StatusList.ORDER_DELIVERED_TO_BUYER%>">
			  				<input type="submit" value="Deliver Now" class="btn btn-success">
		  				</form>
	  				</div>
				<%}}%>
		  </div>
		</div>
	<%}%>
</div>