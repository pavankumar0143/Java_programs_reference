package com.zoho.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.zoho.bean.CustomerDetails;
import com.zoho.bean.GiftCard;
import com.zoho.database.Database;


public class Customer {
	Database db=new Database();
	Scanner sc=new Scanner(System.in);
	
	private double addBalence(double avl){
		System.out.println("Amount you want to add");
		double add=sc.nextDouble();
		if(add>avl){
			System.out.println("low balence");
			System.out.println("Available :"+avl);
			addBalence(avl);
		}
		return add;
	}
	
	public void newGiftCard(int id){
		CustomerDetails cd=db.getDetails().get(id);
		GiftCard card=new GiftCard();
		card.setCardnum(GiftCard.getSeq());
		card.setPin(GiftCard.getPinseq());
		card.setBalence(addBalence(cd.getBalence()));
		cd.setBalence(cd.getBalence()-card.getBalence());
		db.addCards(card.getCardnum(), cd.getCustid());
		ArrayList<GiftCard> lst=cd.getCard();
		lst.add(card);
		cd.setCard(lst);
		db.addDetails(id, cd);
		db.addGiftCards(card.getCardnum(), card);
		System.out.println("Create more GiftCards Y/N");
		if(sc.next().equalsIgnoreCase("y")){
			newGiftCard(id);
		}
		else
			Options.customerOperations(id);
	}
	
	public CustomerDetails getusrDetails(int usr){
		return db.getDetails().get(usr);
	}
	public int getuserId(Long id){
		return db.getCards().get(id);
	}
}
