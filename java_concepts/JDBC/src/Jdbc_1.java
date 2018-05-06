
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;



public class Jdbc_1 {
	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cn=DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:XE","pavan1","pavan1");
		if(cn==null){
			System.out.println("Connection is not esthablished");
		}
		else
			System.out.println("connection is esthablished");
		Statement st=cn.createStatement();
		cn.setAutoCommit(false);
		//ResultSet rs=st.executeQuery("select * from dept");
		/*while(rs.next()){
			System.out.println(
					rs.getString(1)+" "+rs.getString(2));
		}
		*/
		// INsert
		//String sql="insert into dept values(50,'Service','India')";
		String sql=" delete from dept where dname='Service' ";
		
		int ret=st.executeUpdate(sql);
		cn.commit();
		ArrayList<details> al=new ArrayList<details>();
		System.out.println("succesfully inserted"+" "+ret+" row");
		
		ResultSet rs=st.executeQuery("select * from dept");
		
		details dt ;
		
		while(rs.next()){
			dt=new details();
			dt.setS1(rs.getString(1));
			dt.setS2(rs.getString(2));
			dt.setS3(rs.getString(3));
			al.add(dt);
	
		}
		System.out.println(al);
		Iterator<details> it=al.iterator();
		while(it.hasNext()){
			details dt1=it.next();
		System.out.println(dt1.getS1()+" "+dt1.getS2()+" "+dt1.getS3());
		}
	}
}
class details{
	String s1,s2,s3;

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	public String getS3() {
		return s3;
	}

	public void setS3(String s3) {
		this.s3 = s3;
	}
}



