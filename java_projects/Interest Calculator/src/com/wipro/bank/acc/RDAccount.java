package com.wipro.bank.acc;
import java.lang.Math;


public class RDAccount extends Account {
	int tenure;float principal;float rateOfInterest;
	public   RDAccount(int   tenure, float principal){
		this.tenure=tenure;
		this.principal=principal;
	}
	public void setInterest(int age,String gender){
		if(age<60 && "Male".equalsIgnoreCase(gender)){
			this.rateOfInterest=9.8f;
		}
		else if(age>=60 && "Male".equalsIgnoreCase(gender)){
			this.rateOfInterest=10.5f;
		}
		else if(age>=58 && "Female".equalsIgnoreCase(gender)){
			this.rateOfInterest=10.8f;
		}
		else if(age<58 && "Female".equalsIgnoreCase(gender)){
			this.rateOfInterest=10.2f;
		}
	}
	public float calculateAmountDeposited(){
		return principal*tenure*12;
	}
	public float calculateInterest(){
			float interest=0.0f;
			float r=1+((rateOfInterest/100)/4);
			float t;
				for(int i=tenure*12;i>0;i--){
					t=((float)i/12.0f)*4.0f;
					 interest =interest+(float) (principal*(Math.pow(r,t)-1));
				}
			return interest;	
	}
	
}
