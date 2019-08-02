<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.error{
		color:red;
		font-style: italic;
		font-weight: bold;
	}
</style>
</head>
<body>
	<springForm:form method="POST" commandName="customer" action="save">
		<table>
			<tr>
				<td>Name</td>
				<td><springForm:input path="name"></springForm:input></td>
				<td><springForm:errors cssClass="error" path="name"></springForm:errors></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><springForm:input path="email"></springForm:input></td>
				<td><springForm:errors cssClass="error" path="email"></springForm:errors></td>
				
			</tr>
			<tr>
				<td>Age</td>
				<td><springForm:input path="age"></springForm:input></td>
				<td><springForm:errors cssClass="error" path="age"></springForm:errors></td>
			</tr>
			<tr>
				<td>
					<springForm:select path="gender">
						<springForm:option value="MALE" label="Male"></springForm:option>
						<springForm:option value="FEMALE" label="Female"></springForm:option>
						<springForm:option value="TRANS" label="Trans"></springForm:option>
					</springForm:select>
				</td>
				<td><springForm:errors cssClass="error" path="gender"></springForm:errors></td>
			</tr>
			<tr>
				<td>Birthday></td>
				<td>
					<springForm:input path="birthday" placeholder="MM/dd/yyyy"></springForm:input>
				</td>
				<td><springForm:errors cssClass="error" path="birthday"></springForm:errors></td>
			</tr>
			<tr>
				<td><input type="reset"></td>
				<td><input type="submit" value="Save Customer"></td>
			</tr>
		</table>
	</springForm:form>
	

	
</body>
</html>