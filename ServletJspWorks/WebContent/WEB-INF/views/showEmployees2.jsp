<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="training.jdbc.beans.Employee" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="sai" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>

		<sai:forEach items="${employees}" var="emp">
		<tr>
			<td>${emp.empId}</td>
			<td>${emp.empName}</td>
			<td>${emp.empEmail}</td>
			<td>${emp.empDob}</td>
			<td>${emp.deptId}</td>
			<td>${emp.empSalary}</td>
		</tr>
		</sai:forEach>
</table>
</body>
</html>

