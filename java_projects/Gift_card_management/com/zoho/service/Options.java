package com.zoho.service;

import java.util.Scanner;

import com.zoho.bean.CustomerDetails;
import com.zoho.bean.GiftCard;
import com.zoho.bean.Transaction;
import com.zoho.main.MainMeathod;
import com.zoho.util.Validate;

public class Options {

	static Scanner sc=new Scanner(System.in);
	

	public static void start(){
		
		int choice=0;
		System.out.println("--------WELCOME-------");
		System.out.println(" 1.ADMIN      2.USER");
		choice=sc.nextInt();
		if(choice==1){
			displayAdminOptions();
		}
		else if(choice==2){
			displayCustomerOptions();
		}
	}
	
	public static void displayAdminOptions(){
		Admin ad=new Admin();
		System.out.println("------HELLO ADMIN------");
		System.out.println("   1.Add Details\n   2.Update details\n   3.Delete details\n   4.Logout");
			switch(sc.nextInt()){
				case 1:ad.addDetails();break;
				case 4:start();
			}
	}
	
	public static void displayCustomerOptions(){
		System.out.println("------Welcome------");
		System.out.println("   1.Account login   2.Purchase");
			switch(sc.nextInt()){
				case 1:{
					System.out.println("Enter UserId");
						int usr=sc.nextInt();
					System.out.println("Enter Your Password");
						String psw=sc.next();
							if(Validate.loginCheck(usr,psw)){
								customerOperations(usr);
							}
							else displayCustomerOptions();
				}break;
				case 2:Purchase.doPurchase();break;
			}
	}
	
	public static void customerOperations(int usr){
		Customer cs=new Customer();
		CustomerDetails cd=cs.getusrDetails(usr);
		System.out.println("Customerid :"+cd.getCustid()+" Account no: "+cd.getAccount_no()+" Name :"+cd.getName()+" Balence"+cd.getBalence());
		System.out.println(cd.getCard().size());
			for(GiftCard i:cd.getCard()){
					System.out.println("Gift Cards :"+i.getCardnum()+" Balence"+i.getBalence()+" PIn "+i.getPin());
			}
		System.out.println("----Welcome-----");
		System.out.println("  1.Create a new Gift Card\n  2.Top-up the existing card\n  3.Show Gift Card Transaction History\n  4.Block the existing Card\n  5.Logout");
		switch(sc.nextInt()){
			case 1: cs.newGiftCard(usr);break;
			case 3: System.out.println("Enter card num");
						GiftCard gf=Validate.displayTran(sc.nextLong());
						if(gf.getTran()!=null)
							for(Transaction t:gf.getTran())
								System.out.println("Transaction bill :"+t.getAmount());
						else {
							System.out.println("no Tansactions are made");
						}
						break;
			case 5: displayCustomerOptions();break;
		}
	}
}
