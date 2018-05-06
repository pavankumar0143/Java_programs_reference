package com.zoho.bean;

public class Transaction {
	
	private double amount;
	private Long cardnum;
	private int pin;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Long getCardnum() {
		return cardnum;
	}
	public void setCardnum(Long cardnum) {
		this.cardnum = cardnum;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
