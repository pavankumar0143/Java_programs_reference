package demo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;


public class NEXprime {
	 
	public void nxtPrime(ArrayList ls,long n,long m){
		String c="";
		BigInteger b=new BigInteger(n+"");
		c=b.nextProbablePrime().toString();
	
		if(Long.parseLong(c)>m){
			System.exit(0);
		}
			 ls.add(Long.parseLong(c));
			 
	
		if(n<m)
			nxtPrime(ls,Long.parseLong(c),m);
			
	}
	public static void main(String[] args) {
		ArrayList<Long> ls=new ArrayList<Long>();
		NEXprime ns=new NEXprime();
			ns.nxtPrime(ls,1,100);
			Iterator<Long> it =ls.iterator();
			while(it.hasNext()){
				System.out.print(it.next()+",");
				System.out.println(it);
			}
		
		}
}
