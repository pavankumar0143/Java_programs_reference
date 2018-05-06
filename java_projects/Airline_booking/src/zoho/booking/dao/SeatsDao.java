package zoho.booking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import zoho.booking.bean.Details;
import zoho.booking.bean.Seat;
import zoho.booking.util.GetConnection;

public class SeatsDao {
	public int insert(Details d,Seat s){
		int i=0;
		try {
			Connection con=GetConnection.getDBcon();
			PreparedStatement ps=con.prepareStatement("insert into seat_info values(?,?,?)");
			
			ps.setInt(1,d.getFlight_no());
			ps.setInt(2,s.getSeet());
			ps.setInt(3,s.getValue());
			ps.setString(4,d.getMeals());
			i=ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			return 0;
		}
		return i;
	}
	public ArrayList<Integer> get_avail(int number){
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		try {
			Connection con=GetConnection.getDBcon();
			PreparedStatement ps=con.prepareStatement("select * from seat_info where flight_no=?");
			
			ps.setInt(1,number);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				if(rs.getInt(3)==0)
				al.add(rs.getInt(3));
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return al;
	}
	public ArrayList<Integer> get_meals(int number){
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		try {
			Connection con=GetConnection.getDBcon();
			PreparedStatement ps=con.prepareStatement("select * from seat_info where flight_no=?");
			
			ps.setInt(1,number);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				if(rs.getInt(3)==1)
				al.add(rs.getInt(3));
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return al;
	}
	
}
