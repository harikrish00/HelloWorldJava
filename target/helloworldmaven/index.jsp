<html>
<body>
<h2>Hello World!</h2>
<%= new String("This page is created on 18/03 13:40 to test current next") %>
<br>
Server host name is: <b><%=request.getServerName() %></b>
Server Info is: <b><%=application.getServerInfo() %></b>
Server Init Params are: <b><%=application.getInitParameterNames() %></b>
</body>
</html>
