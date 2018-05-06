package zoho.booking.bean;

public class Details {
	private int booking_id,flight_no;
	private String operation;
	private String seat_class;
	private int total_seats;
	private String meals ;
	private static int price_B=2000;
	private static int price_E=1000;
	private static int price_meals=200;
	private final int c_fee=200;
	private int total;
	private Seat s;
	public Seat getS() {
		return s;
	}
	public void setS(Seat s) {
		this.s = s;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getC_fee() {
		return c_fee;
	}
	public void setPrice_B(int price_B) {
		Details.price_B = price_B;
	}
	public void setPrice_E(int price_E) {
		Details.price_E = price_E;
	}
	public void setPrice_meals(int price_meals) {
		Details.price_meals = price_meals;
	}
	public int getPrice_meals() {
		return price_meals;
	}
	public int getPrice_B() {
		return price_B;
	}
	public int getPrice_E() {
		return price_E;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getFlight_no() {
		return flight_no;
	}
	public void setFlight_no(int flight_no) {
		this.flight_no = flight_no;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getSeat_class() {
		return seat_class;
	}
	public void setSeat_class(String seat_class) {
		this.seat_class = seat_class;
	}
	public int getTotal_seats() {
		return total_seats;
	}
	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}
	public String getMeals() {
		return meals;
	}
	public void setMeals(String meals) {
		this.meals = meals;
	}
	
	
}
