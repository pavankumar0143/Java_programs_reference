package com.zoho.service;

import java.util.Scanner;

import com.zoho.bean.Transaction;
import com.zoho.util.Validate;

public class Purchase {
	static Scanner sc=new Scanner(System.in);
	public static void doPurchase(){
		Transaction tn=new Transaction();
			System.out.println("Your bill amount: ");
			tn.setAmount(sc.nextDouble());
			System.out.println("Enter Card number: ");
			tn.setCardnum(sc.nextLong());
			System.out.println("Ente PIN:");
			tn.setPin(sc.nextInt());
			if(Validate.pinCheck(tn.getCardnum(), tn.getPin())){
				System.out.println("Your balence is:"+Validate.calBal(tn.getAmount(),tn.getCardnum()));
				Validate.addTran(tn.getCardnum(), tn);
				System.out.println("Do you want continue with orther transaction Y/N");{
					if(sc.next().equals("Y")){
						doPurchase();
					}
					else{
						Options.displayCustomerOptions();;
					}
				}
			}
			else{
				System.out.println(" pin or card mismatch");
				doPurchase();
			}
		}
}
