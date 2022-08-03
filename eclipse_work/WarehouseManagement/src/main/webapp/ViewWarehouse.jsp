<%@page import="java.util.Iterator"%>
<%@page import="warehouse.express.models.WarehouseModel"%>
<%@page import="java.util.List"%>
<%@page import="warehouse.express.dao.WarehouseDao"%>
<%@ include file="Boot1.jsp" %>

<%
 	WarehouseDao warehouseDao=new WarehouseDao();
	List<WarehouseModel> warehouseList=warehouseDao.ViewWarehouse();
	Iterator<WarehouseModel> wareIterator=warehouseList.iterator();
%>

<div class="container">
<div class="text-center h4 m-5">Warehouse Details</div>
<table class="table table-primary table-bordered">
	<thead>
		<tr>
			<th>WarehouseName</th>
			<th>Phone</th>
			<th>Email</th>
			<th>ManagerName</th>
			<th>Address</th>
			<th>Location</th>
		</tr>
	</thead>
	<tbody>
		<%
			while(wareIterator.hasNext()){
				WarehouseModel warehouseModel = wareIterator.next();%>
				<tr>
					<td><%=warehouseModel.getWarehouseName()%></td>
					<td><%=warehouseModel.getPhone()%></td>
					<td><%=warehouseModel.getEmail()%></td>
					<td><%=warehouseModel.getManagerName()%></td>
					<td><%=warehouseModel.getAddress()%></td>
					<td><%=warehouseModel.getLocationModel().getLocationName()%></td>
				</tr>
			<%}
		%>
	</tbody>
</table>
</div>
