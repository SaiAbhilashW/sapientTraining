<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<h2>Welcome to training</h2>
	<%
		Date date = new Date();
		out.print("Todays date is " + date.toGMTString()); 
		System.out.println("Hi, im in service"); //everytime page is refreshed
	%>
	
	<%!
		public void jspInit(){
			System.out.println("HI, im from init"); //on server init
		}
	
		public void jspDestroy(){
			System.out.println("HI, im from destory"); ///on server stop
		}
	%>
	
	
	<a href="./GetAllEmployeeController">Get all employees</a>
</body>
</html>