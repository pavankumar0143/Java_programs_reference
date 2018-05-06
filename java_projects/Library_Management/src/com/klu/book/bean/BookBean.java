package com.klu.book.bean;

public class BookBean {
	private String	isbn="";
	private String	bookName="";
	private AuthorBean	author=null;
	private char	bookType;
	private float	cost=0.0f;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public AuthorBean getAuthor() {
		return author;
	}
	public void setAuthor(AuthorBean author) {
		this.author = author;
	}
	public char getBookType() {
		return bookType;
	}
	public void setBookType(char bookType) {
		this.bookType = bookType;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	

}
