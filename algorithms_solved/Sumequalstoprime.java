import java.math.BigInteger;
//Find primes in range and give output of specified input repetations
public class Sumequalstoprime {
		static String s="";static BigInteger b;
		public static String prime(int a,int c){
			b=new BigInteger(String.valueOf(a));
			
			System.out.println("gcd"+b.gcd(new BigInteger(String.valueOf(c))));
			if(b.nextProbablePrime().intValue()<c)
			{
				s=s+" "+b.nextProbablePrime().toString();
				prime(b.nextProbablePrime().intValue(),c);
			}
		return s;	 
		}
	public static void main(String[] args) {
		String s1;
		int input1=1;
		int input2=99;
		BigInteger b=new BigInteger(String.valueOf(5));
		if(b.isProbablePrime(input1))
			{
			s1=String.valueOf(input1);
			}
		else 
			s1="";
		s1=s1+prime(10,15);
		System.out.println(s1);
		int a=s1.length()-s1.replace("1","").length();
		System.out.println(a);
	}
}
