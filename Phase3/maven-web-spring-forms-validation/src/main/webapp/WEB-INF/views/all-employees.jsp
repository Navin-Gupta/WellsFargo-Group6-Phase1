<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>All Employees</h2>
<a href="${pageContext.request.contextPath}/employee/profile-entry">Add new record</a>
<hr/>
<table>
	<thead>
		<th>Name</th>
		<th>Email</th>
		<th>Contact</th>
		<th>DOB</th>
		<th></th>
	</thead>
	<tbody>
		<core:forEach var="employee" items="${employees}">
		<tr>
			<td>${employee.name}</td>
			<td>${employee.email}</td>
			<td>${employee.contact}</td>
			<td>${employee.dob}</td>
			<td><a href="${pageContext.request.contextPath}/employee/edit/${employee.name}">EDIT</a></td>
		</tr>
		</core:forEach>
		
	</tbody>
</table>
</body>
</html>










