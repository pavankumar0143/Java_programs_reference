package com.wipro.eb.main;
import java.util.Scanner;

import com.wipro.eb.service.ConnectionService;
public class EBMain {
 private static Scanner sc;

public static void main(String[] args) {
	 sc = new Scanner(System.in);
	 int cr=sc.nextInt();
	 int pr=sc.nextInt();
	 String tc=sc.next();
	 tc=tc.substring(0, 1).toUpperCase()+tc.substring(1);
	 
	 System.out.println(new ConnectionService().generateBill(cr,pr,tc));
}
}
