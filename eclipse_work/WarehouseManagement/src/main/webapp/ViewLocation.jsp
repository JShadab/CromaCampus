<%@page import="warehouse.express.models.LocationModel"%>
<%@page import="warehouse.express.dao.LocationDao"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>

<%@ include file="Boot1.jsp" %>
<%
	LocationDao locationDao=new LocationDao();
	List<LocationModel> locationList=locationDao.getLocations();
	Iterator<LocationModel> localterator=locationList.iterator();
%>
<div class="container">
<div class="text-center h4 m-5">Locations</div>
<table class="table table-primary table-bordered">
	<thead>
		<tr>
			<th>LocationId</th>
			<th>LocationName</th>
			
		</tr>
	</thead>
	<tbody>
		<%
			while(localterator.hasNext()){
				LocationModel locationModel = localterator.next();%>
				<tr>
					<td><%=locationModel.getLocationId()%></td>
					<td><%=locationModel.getLocationName()%></td>
					
				</tr>
			<%}
		%>
	</tbody>
</table>
</div>