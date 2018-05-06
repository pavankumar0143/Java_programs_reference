package com.zoho.util;

import java.util.ArrayList;

import com.zoho.bean.GiftCard;
import com.zoho.bean.Transaction;

import com.zoho.database.Database;


public class Validate {
	static Database db=new Database();
	
	public static boolean loginCheck(int id,String s){
				return db.checkDetails(id, Operations.encodeString(s));
	}
	
	public static boolean pinCheck(Long id,int pin){
		System.out.println("in check");
		if(db.getGc().containsKey(id)){
			GiftCard gc=db.getGc().get(id);
			if(gc.getPin()==pin){
				return true;
			}
		}
		return false;
	}
	public static double calBal(double bill,long card){
		GiftCard gc=db.getGc().get(card);
		double bal=gc.getBalence()-bill;
		db.updateCardBal(card, bal);
		return bal;
	}
	
	public static void addTran(Long card,Transaction tn){
		GiftCard gc=db.getGiftCards(card);
		ArrayList<Transaction> lst=gc.getTran();
		lst.add(tn);
		gc.setTran(lst);
		db.addGiftCards(card, gc);
	}
	public static GiftCard displayTran(Long id){
		return db.getGc().get(id);
	}
}
