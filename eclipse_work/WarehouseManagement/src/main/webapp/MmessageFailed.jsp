 <%@ include file="Boot.jsp"%>
 <% 
  String Msg=request.getParameter("Msg");
 %>
<div class="text-center text-danger h4 mt-5">
	<%=Msg %>
</div>