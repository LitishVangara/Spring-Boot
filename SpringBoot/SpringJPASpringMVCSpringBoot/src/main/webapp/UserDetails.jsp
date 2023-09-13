<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserDetails Registration</title>
</head>
<body>
<center>
	<h1>UserDetails Registration</h1>
	<br>
	<form action="userDetailsRegister" method="post">
		<input placeholder="Enter your FirstName" type="text" name="firstName">
		<br><br>
		<input placeholder="Enter your LastName" type="text" name="lastName">
		<br><br>
		<input placeholder="Enter your Email" type="email" name="email">
		<br><br>
		<input placeholder="Enter your Mobile Number" type="number" name="mobileNumber">
		<br><br>
		<input placeholder="Enter Password" type="password" name="password">
		<br><br>
		<input placeholder="Enter Confirm Password" type="password" name="cPassword">
		<br><br>
		<input type="submit" value="Register">
		<br><br>
		<a href="Login.jsp">Already Registered</a>
		<br><br>
		<%
			String message = (String)request.getAttribute("javaMessage");
			if (message != null)
			{
		%>
		<h1 style="color:red;"><%= message%></h1>
		<%
			}
		%>
	</form>
</center>
</body>
</html>