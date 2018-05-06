package com.zoho.bean;

import java.util.ArrayList;

public class CustomerDetails {
	private int custid;
	private String account_no;
	private String name;
	private double balence;
	private String password;
	
	private ArrayList<GiftCard> card=new ArrayList<GiftCard>();
    
	public ArrayList<GiftCard> getCard() {
		return card;
	}
	public void setCard(ArrayList<GiftCard> card) {
		this.card = card;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalence() {
		return balence;
	}
	public void setBalence(double balence) {
		this.balence = balence;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
