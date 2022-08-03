<%@page import="warehouse.express.models.StatusList"%>
<head>
  <title>Warehouse</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <link href="Css/main.css" rel="stylesheet">
</head>

<div class="text-center h2 p-4 text-uppercase" style="background-color:#33AFFF">Warehouse Manager</div>

<nav class="navbar navbar-expand-sm navbar-dark" style="background-color:#0365A4">  
  <!-- Links -->
  <ul class="navbar-nav">
  	  <li class="nav-item"><a class="nav-link" href="WareHouseHome.jsp">Home</a></li>
  	  <li class="nav-item"><a class="nav-link" href="viewOrders.jsp?Status=<%=StatusList.ORDER_RECEIVED_BY_WAREHOUSE%>">View Orders </a></li>
      <li class="nav-item"><a class="nav-link" href="viewOrders.jsp?Status=<%=StatusList.ORDER_DISPATCHED_FROM_WAREHOUSE%>">View Order History </a></li>
      <li class="nav-item"><a class="nav-link" href="AddDeliveryBoy.jsp">Add Delivery Boy </a></li>
      <li class="nav-item"><a class="nav-link" href="ViewDeliveryBoy.jsp">View  Delivery Boys</a></li>
      <li class="nav-item"><a class="nav-link" href="Logout.jsp">Logout</a></li>
  </ul>
</nav>