package com.zoho.database;
import java.util.HashMap;

import com.zoho.bean.CustomerDetails;
import com.zoho.bean.GiftCard;

public class Database {
   protected static HashMap<Integer,CustomerDetails> details=new HashMap<Integer,CustomerDetails>();
   
   protected static HashMap<Long,Integer> cards=new HashMap<Long,Integer>();
   
   protected static HashMap<Long,GiftCard> Gc= new HashMap<Long,GiftCard>();
  
   public HashMap<Integer, CustomerDetails> getDetails() {
	 return details;

   }

   public HashMap<Long , Integer> getCards() {
		 return cards;
   }

   public  HashMap<Long, GiftCard> getGc() {
	   return Gc;
   }
   
   public boolean checkId(int id){
	   return details.containsKey(id);
   }
  
public boolean checkDetails(int id,String s){
	   if(checkId(id)){
		   if(details.get(id).getPassword().equals(s)){
			   return true;
		   }
		   else{
			   return false;
		   }
	   }
	   return false;
	   }

public void addDetails(Integer id, CustomerDetails cd) {
	details.put(id, cd);
}

public void addCards(Long id,Integer cd){
   cards.put(id,cd);
}

public void addGiftCards(Long id,GiftCard gc){
	Gc.put(id, gc);
}

public GiftCard getGiftCards(Long id){
		return Gc.get(id);
}

public void updateCardBal(Long id,double bal){
	GiftCard g=Gc.get(id);
	g.setBalence(bal);
	Gc.put(id, g);
}

public void updateCustBal(Long id ,double bal){
	CustomerDetails cd=details.get(cards.get(id));
	cd.setBalence(bal);
	details.put(cards.get(id), cd);
	}
}

