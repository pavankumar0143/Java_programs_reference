package zoho.booking.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import zoho.booking.bean.Details;
import zoho.booking.util.GetConnection;
public class BookingDao {
	public int insert(Details d){
		int i=0;
		try {
			Connection con=GetConnection.getDBcon();
			PreparedStatement ps=con.prepareStatement("insert into booking_info values(seq_id.nextval,?,?,?,?,?,?)");
			ps.setString(1,d.getOperation());
			ps.setInt(3,d.getFlight_no());
			ps.setString(4, d.getSeat_class());
			ps.setInt(5,d.getTotal_seats());
			ps.setString(6, d.getMeals());
			ps.setInt(7, d.getTotal());
			i=ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			return 0;
		}
		return i;
	}
	public Details get_person(int id){
			Details d=null;
		try {
			Connection con=GetConnection.getDBcon();
			PreparedStatement ps=con.prepareStatement("select * from booking_info where booking_id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				d.setBooking_id(rs.getInt(1));
				d.setOperation(rs.getString(2));
				d.setFlight_no(rs.getInt(3));
				d.setSeat_class(rs.getString(4));
				d.setTotal_seats(rs.getInt(5));
				d.setMeals(rs.getString(6));
				d.setTotal(rs.getInt(7));
			
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return d;
	}
	
}
