package com.wipro.bank.main;

public class TESING {
	public static void main(String[] args) {
		float interest=0.0f;
		float r=1+((10.20f/100)/4);
		float t;
		System.out.println(3000.0f*10*12);
			for(int i=10*12;i>0;i--){
				t=((float)i/12.0f)*4.0f;
				
				 interest =interest+(float) 3000.00*((float)Math.pow(r,t)-1);
			}
			System.out.println(interest);
}
}
