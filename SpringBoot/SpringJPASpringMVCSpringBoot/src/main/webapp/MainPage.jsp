<%@page import="com.jsp.springJPAMVCBoot.entity.UserDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserDetails Main Page</title>
</head>
<body>
	<center>
		<%
			UserDetails userDetails = (UserDetails) request.getAttribute("information");
			if (userDetails != null)
			{
		%>
		<h1>Welcome <%= userDetails.getFirstName()%></h1>
		<%
			}
		%>
	</center>
</body>
</html>