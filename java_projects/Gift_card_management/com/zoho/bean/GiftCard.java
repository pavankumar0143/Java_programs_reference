package com.zoho.bean;

import java.util.ArrayList;

public class GiftCard {
	private long cardnum;
	private long pin;
	private double balence;
	private static long seq=10000;
	private static int pinseq=1000;
	private ArrayList<Transaction> tran=new ArrayList<Transaction>();
	
	public ArrayList<Transaction> getTran() {
		return tran;
	}
	public void setTran(ArrayList<Transaction> tran) {
		this.tran = tran;
	}
	public GiftCard(){
		seq=seq+1;
		pinseq=pinseq+1;
	}
	public static int getPinseq() {
		return pinseq;
	}
	public static void setPinseq(int pinseq) {
		GiftCard.pinseq = pinseq;
	}
	public long getCardnum() {
		return cardnum;
	}
	public void setCardnum(long cardnum) {
		this.cardnum = cardnum;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	public double getBalence() {
		return balence;
	}
	public void setBalence(double balence) {
		this.balence = balence;
	}
	public static long getSeq() {
		return seq;
	}
	public static void setSeq(long seq) {
		GiftCard.seq = seq;
	}
}
