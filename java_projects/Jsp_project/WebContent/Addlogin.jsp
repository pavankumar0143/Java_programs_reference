<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@	page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%	
	String uname=request.getParameter("uname");
	String pswd=request.getParameter("pswd");
	String cpswd=request.getParameter("cpswd");
	String email_id=request.getParameter("email");
	String branch=request.getParameter("branch");
	if(pswd.equals(cpswd)){
	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pavan","pavan");
		PreparedStatement ps=con.prepareStatement("insert into logindetails values(?,?,?,?)");
		ps.setString(1, uname);
		ps.setString(2, email_id);
		ps.setString(3, pswd);
		ps.setString(4, branch);
		int ret=ps.executeUpdate();
		if(ret==1){
			response.sendRedirect("login.jsp");
		}
		else{
			out.print("Values not inserted");
		}
	}
	catch(ClassNotFoundException | SQLException e){
		out.write("email aleready Exists use another");
	}
	}
	else{
		out.write("password Mistach");
	}
%>
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
		</table>	
	</center>
	
	</form>
</body>
</html>