<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		HttpSession mySession = request.getSession();
	
		if(mySession.isNew()){
	%>
		<p>Welcome for the first time</p>
	<%
		} else {
			mySession.setMaxInactiveInterval(5);
	%>
	<p> Hi user welcome back</p>
	<p>Your last session id is <%= mySession.getId() %></p>
	<p>Creation time : <%= new Date(mySession.getCreationTime()) %></p>
	<p>Last access time : <%=  new Date(mySession.getLastAccessedTime()) %></p>
	<p>Max inactive interval : <%= mySession.getMaxInactiveInterval() %></p>
	
	<%
		}
		mySession.invalidate();
	%>
</body>
</html>