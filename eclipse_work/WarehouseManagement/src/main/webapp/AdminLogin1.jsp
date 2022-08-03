<%
	String Username=request.getParameter("Username");
	String password=request.getParameter("password");
	
	if(Username.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("Admin")){
		
		session.setAttribute("Username", Username);
		
		session.setAttribute("Role", "Admin");
		
		response.sendRedirect("AdminHome.jsp");
	}else{
		response.sendRedirect("MmessageFailed.jsp?Msg=Invalid Login Details");
	}
%>>