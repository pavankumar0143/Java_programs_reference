package com.wipro.bank.acc;

import java.text.DecimalFormat;

public abstract class Account {
	int tenure;
	float principle;
	float rateOfInterest;
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
	public   float calculateMaturityAmount(float totalPrincipleDeposited,float maturityInterest){
		float sum=totalPrincipleDeposited+maturityInterest;
		DecimalFormat d=new DecimalFormat("#.##");
		return Float.valueOf(d.format((double)sum));
		} 
	public abstract float calculateInterest();
	public abstract float calculateAmountDeposited();
}
