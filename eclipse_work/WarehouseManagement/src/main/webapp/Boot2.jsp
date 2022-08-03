<%@page import="warehouse.express.models.StatusList"%>
<head>
  <title>Seller</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <link href="Css/main.css" rel="stylesheet">
</head>

<div class="text-center h2 p-4 text-uppercase" style="background-color:#33AFFF">Seller</div>

<nav class="navbar navbar-expand-sm navbar-dark" style="background-color:#0365A4">  
  <!-- Links -->
  <ul class="navbar-nav">
  	  <li class="nav-item"><a class="nav-link" href="SellerHome.jsp">Home</a></li>
      <li class="nav-item"><a class="nav-link" href="AddCategory.jsp">Add Category</a></li>
      <li class="nav-item"><a class="nav-link" href="AddSubcategory.jsp">Add Sub Category</a></li>
      <li class="nav-item"><a class="nav-link" href="AddProduct.jsp">Add Product </a></li>
      <li class="nav-item"><a class="nav-link" href="ViewProducts.jsp">View Products</a></li>
      <li class="nav-item"><a class="nav-link" href="viewOrders.jsp?Status=<%=StatusList.ORDERED%>">View Orders </a></li>
      <li class="nav-item"><a class="nav-link" href="viewOrders.jsp?Status=<%=StatusList.ORDER_ACCEPTED%>">View Order History </a></li>
      <li class="nav-item"><a class="nav-link" href="Logout.jsp">Logout</a></li>
  </ul>
</nav>