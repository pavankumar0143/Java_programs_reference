package com.booksort;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class MainMeathod {
	public static void main(String []args) {
	BookDetails bk;
	TreeSet<BookDetails> k=new TreeSet<BookDetails>();
	for(int i=1;i<13;i++){
		bk=new BookDetails();
		bk.setBookid(i);
		bk.setBook_name("A"+i);
		bk.setSerialnum(i*144);
		k.add(bk);
	}
	
	Iterator<BookDetails> it=k.iterator();
	while(it.hasNext()){
		bk=new BookDetails();
		bk=it.next();
		System.out.println(bk.getSerialnum()+":"+bk.getBook_name()+":"+bk.getBookid());
	}
	
	}
}
