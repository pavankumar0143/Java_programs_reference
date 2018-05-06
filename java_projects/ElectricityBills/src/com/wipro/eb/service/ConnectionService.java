package com.wipro.eb.service;
import com.wipro.eb.exception.*;
import com.wipro.eb.entity.*;
public class ConnectionService {
	static float []s={2.2f,4.2f,5.5f};
	static float []s1={5.2f,6.8f,8.3f};
	public boolean validate(int currentReading, int previousReading, String type) throws InvalidReadingException, InvalidConnectionException{
		
		if(currentReading<previousReading || currentReading<0 || previousReading<0){
			throw new InvalidReadingException();
		}
		else if(type==null || !"Domestic".equals(type) && !"Commercial".equals(type)){
			throw new InvalidConnectionException();
		}
		
		else
			return true;
	}
	public float calculateBillAmt(int currentReading, int previousReading, String type){
			float Bill=0; 
			try{
				 boolean b=validate(currentReading,previousReading,type);
				 if(b){
					 if(type.equalsIgnoreCase("Domestic")){
						 Domestic d=new Domestic(currentReading,previousReading,s);
						 	Bill=d.computeBill();
					 }
					 else if(type.equalsIgnoreCase("Commercial")){
						 Commercial c=new Commercial(currentReading,previousReading,s1);
						 	Bill=c.computeBill();
					 }
					 
				 }
			 }
			 catch(InvalidConnectionException e){
				 Bill=-2;
			 }
			 catch(InvalidReadingException e1){
				 Bill= -1;
			 }
			return Bill;
	}
	public String generateBill(int currentReading, int previousReading, String type){
			float p=calculateBillAmt(currentReading,previousReading,type);
			if(p==-1){
				return "Invalid Reading";
			}
			else if(p==-2){
				return "Invalid Connection";
			}
			else
				return "Amount to be paid:"+String.valueOf(p);
	}
}
