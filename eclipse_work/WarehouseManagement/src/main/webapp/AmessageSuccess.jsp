<%@ include file="Boot1.jsp"%>
 <% 
  String Msg=request.getParameter("Msg");
 %>
<div class="text-center text-success h4 mt-5">
	<%=Msg %>
</div>