package com.booksort;

public class BookDetails implements Comparable<BookDetails>{
	int bookid;
	String book_name;
	int Serialnum;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getSerialnum() {
		return Serialnum;
	}
	public void setSerialnum(int serialnum) {
		Serialnum = serialnum;
	}
	public int compareTo(BookDetails obj){ 
		BookDetails com=obj;  
		if(bookid==com.bookid)  
		return 0; 
		else if(bookid>com.bookid)  
		return 1;  
		else 
		return -1;  
		}
	

}
