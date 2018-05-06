package com.wipro.bank.service;
import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.*;


public class BankService {
			public boolean validateData(float principal,int tenure,int age,String gender){
				try{
				if (principal>=500 && (tenure==5 || tenure==10) && (age>=1 && age<=100) && (gender!=null &&"male".equalsIgnoreCase(gender) || "female".equalsIgnoreCase(gender))){
					return true;
				}
				else {
					throw new BankValidationException();
				}
				}
				catch(BankValidationException e){
					return false;
				}
			}
			public float calculate(float principal,int tenure,int age,String gender) {
					boolean b=validateData(principal,tenure,age,gender);
					if(b){
						RDAccount r=new RDAccount(tenure,principal);
						r.setInterest(age, gender);
						float intr=r.calculateInterest();
						float amtd=r.calculateAmountDeposited();
						return r.calculateMaturityAmount(amtd,intr);
						}
					else
						return 0.0f;
			}
}
