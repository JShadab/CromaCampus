<%@page import="java.util.Iterator"%>
<%@page import="warehouse.express.models.SellerModel"%>
<%@page import="java.util.List"%>
<%@page import="warehouse.express.dao.SellerDao"%>
<%@ include file="Boot1.jsp"%>
<%
SellerDao sellerDao = new SellerDao();
List<SellerModel> sellerList = sellerDao.ViewSellers();
Iterator<SellerModel> sellIterator = sellerList.iterator();
%>
<div class="container">
	<div class="text-center h4 m-5">Seller Details</div>
	<table class="table table-primary table-bordered">
		<thead>
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Phone</th>
				<th>Tin</th>
				<th>Location</th>
				<th>Address</th>
				<th>Status</th>
				<th>Action</th>

			</tr>
		</thead>
		<tbody>
			<%
			while (sellIterator.hasNext()) {
				SellerModel sellerModel = sellIterator.next();
			%>
			<tr>
				<td><%=sellerModel.getName()%></td>
				<td><%=sellerModel.getEmail()%></td>
				<td><%=sellerModel.getPhone()%></td>
				<td><%=sellerModel.getTin()%></td>
				<td><%=sellerModel.getLocationModel().getLocationName()%></td>
				<td><%=sellerModel.getAddress()%></td>
				<td><%=sellerModel.getStatus()%></td>
				<td>
					<%
					if (sellerModel.getStatus().equalsIgnoreCase("deactivated")) {
					%> <a
					href="Activate.jsp?SellerId=<%=sellerModel.getSellerId()%>&Status=<%=sellerModel.getStatus()%>"
					class="btn btn-primary">Activate</a> <%
 } else {
 %> <a href="Activate.jsp?SellerId=<%=sellerModel.getSellerId()%>&Status=<%=sellerModel.getStatus()%>"
					class="btn btn-danger">Deactivate</a> <%
 }
 %>
				</td>

			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</div>
