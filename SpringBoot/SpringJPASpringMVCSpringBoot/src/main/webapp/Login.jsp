<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserDetails Login</title>
</head>
<body>
<center>
		<%
			String message = (String)request.getAttribute("javaMessage1");
			if (message != null)
			{
		%>
		<h1 style="color:green;"><%= message%></h1>
		<br><br>
		<%
			}
		%>
	<form action="userDetailsLogin" method="post">
		<h1>Login</h1>
		<br><br>
		<input placeholder="Enter your Email" type="text" name="email">
		<br><br>
		<input placeholder="Enter Password" type="password" name="password">
		<br><br>
		<input type="submit" value="Login">
	</form>
</center>
</body>
</html>