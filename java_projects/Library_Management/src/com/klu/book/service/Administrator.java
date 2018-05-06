package com.klu.book.service;

import com.klu.book.bean.BookBean;
import com.klu.book.dao.BookDAO;

public class Administrator {
	String addBook(BookBean bookBean) {
		String s="";
		int i=0;
		if(bookBean==null || bookBean.getBookName().equals("") ||
			bookBean.getIsbn().equals("") || 
			bookBean.getAuthor().getAuthorName().equals("") ||
			bookBean.getBookType()!='g' || bookBean.getBookType()!='t'||
			bookBean.getCost()==0.0f) {
			s="INVALID";
		}
		else {
			
			BookDAO BD=new BookDAO();
			i=BD.createBook(bookBean);
			if(i==1){
				s="SUCCESS";
			}
			else
				s="FAILURE";
		}
		return s;
	}
	BookBean viewBook(String isbn) {
		BookDAO BD=new BookDAO();
		return BD.fetchBook(isbn); 
	}
	
}
