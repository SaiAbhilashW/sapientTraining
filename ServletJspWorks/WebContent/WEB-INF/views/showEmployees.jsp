<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="training.jdbc.beans.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<%
		List<Employee> list = (List<Employee>) request.getAttribute("employees");
		
		for(Employee temp : list){
	%>
		<tr>
			<td><%= temp.getEmpId() %></td>
			<td><%= temp.getEmpName() %></td>
			<td><%= temp.getEmpEmail() %></td>
			<td><%= temp.getDeptId() %></td>
			<td><%= temp.getEmpSalary() %></td>
		
		</tr>
	<%
		}
	
	%>
</table>
</body>
</html>