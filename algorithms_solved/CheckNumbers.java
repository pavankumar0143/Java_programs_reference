package demo;

import java.util.Scanner;

public  class CheckNumbers {
	static Scanner sc;
	boolean check (String s){
		int l=s.length();
		int count=0;
		for(int i=0;i<(l/2);i++ ){if(Integer.valueOf(s.substring(i, i+1))
				+1==Integer.valueOf(s.substring(i+1,i+2))){
						count++;
						}
		}
		
		if(count==l/2){
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String s1=sc.next();
		
		CheckNumbers cn=new CheckNumbers();
		if(cn.check(s1) && s1.equals(new 
				StringBuilder(s1).reverse().toString())){
				System.out.println("Yes");
		}
		else 
			System.out.println("NO");
		
		
	}
}
