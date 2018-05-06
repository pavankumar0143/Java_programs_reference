<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration From</title>
</head>
<body>
	<form action="Addlogin.jsp">
	
	<center>
	<table>
	<tr><td>UserName:</td><td><input type="text" name="uname"><td></tr>
	<tr><td>Password:</td><td><input type="password" name="pswd"><td></tr>
	<tr><td>Confirm Password:</td><td><input type="password" name="cpswd"><td></tr>
	<tr><td>Email id:</td><td><input type="text" name="email"><td></tr>
	<tr><td>Course:</td><td>
	<select name="branch" style="width:150px">  
		<option>ECE</option>  
		<option>CSE</option>  
		<option>EEE</option>  
		<option>ECM</option>
		</select><td></tr>
	<tr ><td colspan="2"><input type="submit" value="submit"></td></tr>
		</table>	
	</center>
	
	</form>
	
</body>
</html>