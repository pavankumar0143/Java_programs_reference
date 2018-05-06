package com.wipro.bank.main;
import java.util.Scanner;

import com.wipro.bank.exception.BankValidationException;
import com.wipro.bank.service.*;
public class MainClass {	
	public static void main(String[] args) throws BankValidationException {
		BankService b=new BankService();
		System.out.println(b.calculate(500.f, 10, 50, "Male"));
	}
}
