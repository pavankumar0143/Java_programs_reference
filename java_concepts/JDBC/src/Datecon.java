import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
public class Datecon {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(
		 "jdbc:oracle:thin:@localhost:1521:XE","pavan1","pavan1");
		if(con==null){
			System.out.println("Not connected");
			}
		else
			System.out.println("Connected");
		/*java.util.Date cd=new java.util.Date();
		java.sql.Date sd=new java.sql.Date(cd.getTime());
		PreparedStatement ps=con.prepareStatement("insert into doj values(?)");
		ps.setDate(1, sd);
		int ret=ps.executeUpdate();
		System.out.println(ret);
		*/
		/*String dt="13/08/2016";
		SimpleDateFormat fd=new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date dt1=fd.parse(dt);
		java.sql.Date sd=new java.sql.Date(dt1.getTime());
		PreparedStatement ps=con.prepareStatement(
				"insert into doj values(?)");
		ps.setDate(1, sd);
		int ret=ps.executeUpdate();
		System.out.println(ret);
		*/
		PreparedStatement ps=con.prepareStatement(
				"select * from dept");
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rsmd=rs.getMetaData();
		int r1=rsmd.getColumnCount();
		for(int i=1;i<=r1;i++){
			System.out.println(
			rsmd.getColumnName(i)+" "+
			rsmd.getColumnTypeName(i)+" "+
			rsmd.getColumnType(i));
		
		}
	
	}
	
}
