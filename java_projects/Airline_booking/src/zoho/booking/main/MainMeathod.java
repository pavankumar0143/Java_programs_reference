package zoho.booking.main;

import java.util.Scanner;

import zoho.booking.service.Booking;
public class MainMeathod {
	public static int menu(){
		System.out.println("________Menu_____________");
		System.out.println("	1.Booking ");
		System.out.println("    2.Cancellation");
		System.out.println("    3.Avaible Seats");
		System.out.println("    4.Seats With meals");
		System.out.println("    5.Summary");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		return i;
	}
		public static void main(String[] args) {
			int i=menu();
			int flight_no=0;
			Scanner sc=new Scanner(System.in);
			while(!(i>=1 && i<=5)){
				System.out.println("Choose Correction option");
				i=menu();
			}
			Booking bk=new Booking();
			if(i==1){
				
				boolean t=true;
				while(t){
				System.out.println("Enter flight_no /n1.101 /n2.102");
				flight_no=sc.nextInt();
				System.out.println("Enter total Seats want to book");
				int totalSeats=sc.nextInt();
				if(bk.SeatsAvail(flight_no).size()<totalSeats){
					System.out.println("Seats not Available Choose another flight");
					
				}
				else{
					t=false;
				}
				}
				System.out.println("select Seats"+bk.SeatsAvail(flight_no));
				String tick=sc.next();
				bk.Book();
			}
			else if(i==2){
				System.out.println("Enter Booking Id");
				
				bk.Cancel(sc.nextInt());
			}
			else if(i==3){
				System.out.println("Enter Flight id");
				bk.SeatsAvail(sc.nextInt());
			}
			else if(i==4){
				System.out.println("Enter Flight id");
				bk.MealsSeats(sc.nextInt());
			}
			else if(i==5){
				System.out.println("Enter Flight id");
				bk.summary(sc.nextInt());
			}
			
		}
}
