<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display</title>
</head>
<body>
	<h1>Display.jsp</h1>
	<%
		String name = request.getParameter("name");
		String city = request.getParameter("city");
	%>
	<%= name %>
	<%= city %>
</body>
</html>