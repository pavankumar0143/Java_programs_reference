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
	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pavan","pavan");
		PreparedStatement ps=con.prepareStatement("select * from logindetails where emailid=?");
		ps.setString(1, uname);
		ResultSet ret=ps.executeQuery();
		if(ret.next() && ret.getString(3).equals(pswd)){
			response.sendRedirect("userpage.jsp?uname="+ret.getString(1));
		}
		else{
			out.print("Invalid Password");
		}
	}
	catch(ClassNotFoundException | SQLException e){
		out.print("invalid email");
	}
%>
<form action="View.jsp">
		UserName:<input type="text" name="uname">
		Password:<input type="password" name="pswd">
		<input type="submit" value="go">		
	</form>	
</body>
</html>