<%@page import="warehouse.express.models.DeliveryBoyModel"%>
<%@page import="warehouse.express.dao.DeliveryBoyDao"%>
<%@page import="java.util.Iterator"%>
<%@page import="warehouse.express.models.WarehouseModel"%>
<%@page import="java.util.List"%>
<%@page import="warehouse.express.dao.WarehouseDao"%>
<%@ include file="Boot4.jsp" %>

<%
String WarehouseId=(String)session.getAttribute("WarehouseId");
	DeliveryBoyDao deliveryBoyDao=new DeliveryBoyDao();
	List<DeliveryBoyModel> deliveryBoyList=deliveryBoyDao.ViewDeliveryBoy(WarehouseId);
	Iterator<DeliveryBoyModel> deliveryIterator=deliveryBoyList.iterator();
%>

<div class="container">
<div class="text-center h4 m-5">Delivery Boy Details</div>
<table class="table table-primary table-bordered">
	<thead>
		<tr>
			<th>Name</th>
			<th>Phone</th>
			<th>Email</th>
			<th>Experience</th>
		</tr>
	</thead>
	<tbody>
		<%
			while(deliveryIterator.hasNext()){
				DeliveryBoyModel deliveryBoyModel = deliveryIterator.next();%>
				<tr>
					<td><%=deliveryBoyModel.getName()%></td>
					<td><%=deliveryBoyModel.getPhone()%></td>
					<td><%=deliveryBoyModel.getEmail()%></td>
					<td><%=deliveryBoyModel.getExperience()%> Years</td>
				</tr>
			<%}
		%>
	</tbody>
</table>
</div>
