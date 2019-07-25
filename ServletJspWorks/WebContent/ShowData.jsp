<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Data</title>
</head>
<body>
 <p><%= request.getAttribute("employeeList") %></p>
	<% for(int i = 0; i <10; i++){ %>
		<p>hello <%= i %></p>
		<%} %>
</body>
</html>