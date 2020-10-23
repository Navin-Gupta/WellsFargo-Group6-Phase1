<%@page import="com.wf.training.web.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Profile Info...</h2>
<hr/>
<%
	// fetch the data from request object
	// request, response, session, writer... : by default exposed in jsp
	Student student = (Student) request.getAttribute("student");
	// Student student = (Student) session.getAttribute("student");
	
%>
<h2>NAME : <%=student.getName() %></h2>
<h2>EMAIL : <%=student.getEmail() %></h2>
<h2>CONTACT : <%=student.getContact() %></h2>
</body>
</html>