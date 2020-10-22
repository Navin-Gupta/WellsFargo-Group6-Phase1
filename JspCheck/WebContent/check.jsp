<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>JSP RESPONSE...</h1>
<%--
	JSP Comment
 --%>
<%
	// java comment
	String str = "Hello";
%>

<%!
	String data = "";
	private void fun(){
		
	}
	public void init(){
		
	}
%>

<h1><%=str %></h1>

<%
	for(int i=1;i<=10;i++) {
%>
	<input type="text" id="txt<%=i %>" value="<%=str%>"/>
	<br/><br/>

<% } %>	



</body>
</html>