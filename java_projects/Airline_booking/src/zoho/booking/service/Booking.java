package zoho.booking.service;

import java.util.ArrayList;

import zoho.booking.bean.Details;
import zoho.booking.dao.BookingDao;
import zoho.booking.dao.SeatsDao;

public class Booking {
	BookingDao bd=new BookingDao();
	SeatsDao sd=new SeatsDao();
		public void  Book(){
		}
		public void  Cancel(int id){
			
		}
		public ArrayList<Integer> SeatsAvail(int flight_no){
			ArrayList<Integer> al=new ArrayList<Integer>();
			al=sd.get_avail(flight_no);
			return al;
		}
		public void MealsSeats(int flight_no){
			
		}
		public void summary( int flight_no){
			
		}
}
