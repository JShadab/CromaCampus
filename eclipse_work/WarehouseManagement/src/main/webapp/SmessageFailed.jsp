 <%@ include file="Boot2.jsp"%>
 <% 
  String Msg=request.getParameter("Msg");
 %>
<div class="text-center text-danger h4 mt-5">
	<%=Msg %>
</div>