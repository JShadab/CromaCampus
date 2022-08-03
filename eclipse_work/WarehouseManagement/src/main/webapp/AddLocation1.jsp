<%@page import="warehouse.express.dao.LocationDao"%>
<%@page import="warehouse.express.models.LocationModel"%>
<% 

	String LocationName = request.getParameter("LocationName");
	LocationModel locationModel = new LocationModel();
	locationModel.setLocationName(LocationName);
	LocationDao locationDao= new LocationDao();
	locationDao.addLocation(locationModel, response);
	
%>