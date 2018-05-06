package com.book.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MainMeathod {
	public static void main(String[] args) 
		{
		// TODO Auto-generated constructor stub
	LinkedHashMap<Integer,BookDetails> k=new LinkedHashMap<Integer,BookDetails>();
	//BookDetails bk=new BookDetails();
	//BookDetails bk1=new BookDetails();
	//BookDetails bk2=new BookDetails();
	Scanner sc=new Scanner(System.in);
	BookDetails b[]=new BookDetails[10];
	for (int i=0;i<2;i++){
		b[i]=new BookDetails();
		b[i].setBookid(sc.nextInt());
		b[i].setBook_name(sc.next());
		b[i].setSerialnum(sc.nextInt());
		k.put(sc.nextInt(), b[i]);
	}
	Set<Entry<Integer,BookDetails>> s1=k.entrySet();
	Iterator<Entry<Integer, BookDetails>> itt1=s1.iterator();
	while(itt1.hasNext()){
	Map.Entry<Integer,BookDetails> mm =(Entry<Integer,BookDetails>)itt1.next();
		System.out.println(mm.getValue().getBookid()+"::"+mm.getValue().getBook_name()+
				"::"+mm.getKey());
		itt1.remove();
		System.out.println(k.size());
	}//
	}
}