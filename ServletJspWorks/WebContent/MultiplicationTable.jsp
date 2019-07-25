<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="MultiplicationForm.jsp" %>
	
	<h2>Multiplication Table</h2>
	<table border="3">
	<%
		try{
			int val = Integer.parseInt(request.getParameter("val"));
			
			out.println("Multiplication table for " + val);
					
					for(int i = 1; i <= 10;i++){
		%>
					<tr><td>
						<%= val %> x <%= i %> = <%= val*i %>
					</td></tr>
		<%
					}
		
		} catch(NumberFormatException e){
			out.println("Please enter only numbers");
		}
		%>
	
	</table>
</body>
</html>