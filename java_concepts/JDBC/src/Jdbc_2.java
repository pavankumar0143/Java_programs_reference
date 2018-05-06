import java.sql.*;

import java.util.Scanner;

//Prepared Statements
public class Jdbc_2 {
	static Connection con ;
	static Scanner sc;
	String username,password;
	Jdbc_2(String username,String password){
		this.username=username;
		this.password=password;
	}
	boolean connect(){
		con = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE",username,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(con==null){
			return false;
		}
		else
			return true;
		
	}
	public int Prepared(int sel,int a,String s1,String s2){
		int ret=0;
		
		try {
			if(sel==1){
				connect();
			PreparedStatement Ps=con.prepareStatement(
					"insert into dept values(?,?,?)");
			con.setAutoCommit(false);
			Ps.setInt(1, a);
			Ps.setString(2, s1);
			Ps.setString(3, s2);
			ret=Ps.executeUpdate();
			con.commit();
			}
			else if(sel==2){
				connect();
				PreparedStatement Ps=con.prepareStatement(
						"update dept set DName =?,loc=? where deptno=?");
				con.setAutoCommit(false);
				Ps.setInt(3, a);
				Ps.setString(1, s1);
				Ps.setString(2, s2);
				ret=Ps.executeUpdate();
				con.commit();
			}
			else if(sel==3){
				connect();
				PreparedStatement Ps=con.prepareStatement(
				" delete from dept where deptno=?");
				con.setAutoCommit(false);
				Ps.setInt(1, a);
				ret=Ps.executeUpdate();
				con.commit();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
	public  void Insert(){
		
		sc=new Scanner(System.in);
		System.out.println("Enter id no of dept,Name of Dept & Name of Loc");
		int id=sc.nextInt();
		String dname=sc.next();
		String dloc=sc.next();
		if(Prepared(1,id,dname,dloc)==1){
			System.out.println("Row Inserted");
		}
		else
			System.out.println("Row not inserted");
		
	}
	public void Update(){
		sc=new Scanner(System.in);
		System.out.println("Enter id no of dept,Name of Dept & Name of Loc");
		int id=sc.nextInt();
		String dname=sc.next();
		String dloc=sc.next();
		if(Prepared(2,id,dname,dloc)==1){
			System.out.println("Row Update");
		}
		else
			System.out.println("Row not Update");
	}
	public void delete(){
		sc=new Scanner(System.in);
		System.out.println("Enter id no of dept");
		int id=sc.nextInt();
		
		if(Prepared(3,id,"","")==1){
			System.out.println("Row Deleted");
		}
		else
			System.out.println("Row not Deleted");
	}
	public void display(){
		Statement ps=null;
		connect();
		try {
			ps = con.createStatement();
			ResultSet rs=ps.executeQuery("select * from dept");
			while(rs.next()){
				System.out.println(
				rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println("Enter Username");
		String s1=new Scanner(System.in).next();
		System.out.println("Enter Password");
		String s2=new Scanner(System.in).next();
		Jdbc_2 jd=new Jdbc_2(s1,s2);
		if(jd.connect()==true){
		System.out.println("Connected");
		System.out.println("___________Menu_________ ");
		System.out.println("1.INSERT\n2.UPDATE\n3.DELETE\n4.Display");
		sc=new Scanner(System.in);
		int opt=sc.nextInt();
		
		
		switch(opt){
		case 1:jd.Insert();break;
		case 2:jd.Update();break;
		case 3:jd.delete();break;
		case 4:jd.display();break;
		default:System.out.println("choose valid option");
		}
	}
		else
			System.out.println("Not Connected");
	}

}
