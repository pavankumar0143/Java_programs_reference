package com.klu.car.util;

import java.sql.*;

public class DBUtil {
	public static Connection getDBConn() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("oracle:jdbc:thin:@loacalhost:1521:XE","BECE4309","BECE4309");
		return con;
	}
}
