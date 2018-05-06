package com.zoho.service;

import java.util.Scanner;

import com.zoho.bean.CustomerDetails;

import com.zoho.database.Database;

public class Admin {
	Scanner sc=new Scanner(System.in);
	void addDetails(){
		CustomerDetails cd=new CustomerDetails();
		Database db=new Database();
		int id=0;
		System.out.println("Enter Customer id");
			id=sc.nextInt();
			if(db.checkId(id)){
				System.out.println("User Id Already Exist");
				addDetails();
			}
			else{
				cd.setCustid(id);
					System.out.println("Enter Account Number");
				cd.setAccount_no(sc.next());
					System.out.println("Enter Customer Name ");
				cd.setName(sc.next());
					System.out.println("Enter  available Balance");
				cd.setBalence(sc.nextDouble());
					System.out.println("Enter PassWord");
				cd.setPassword(sc.next());
				db.addDetails(cd.getCustid(),cd);
					System.out.println("Succesfully Added");
					System.out.println("Add more Details Y/N");
				if(sc.next().equalsIgnoreCase("Y")){
					addDetails();
				}
				else 
					Options.displayAdminOptions();
				}
	}

}
