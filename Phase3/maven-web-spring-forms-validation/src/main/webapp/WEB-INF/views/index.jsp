<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello All, Spring Web is responding...</h1>
<hr/>
<a href="${pageContext.request.contextPath}/profile">Profile</a>
<hr/>
<a href="${pageContext.request.contextPath}/student/home">Student Dashboard</a>
<hr/>
<a href="${pageContext.request.contextPath}/employee/home">Employee Dashboard</a>

</body>
</html>