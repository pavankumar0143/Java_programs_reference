package zoho.booking.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
	public static Connection getDBcon() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("orcale:jdbc:thin:@localhost:xe","zoho","zoho");
		return con;
	}
	
}
