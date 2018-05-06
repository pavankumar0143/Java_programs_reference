
public class Exp18 {
	public static void main(String args[]){
		int sum=0,n,s;
		n=Integer.parseInt(args[0]);
		s=n;
		while(n>0)
		{
		sum=sum*10+n%10;
		n=n/10;
		}
		if(sum==s)
		System.out.println(s+" is a palindrome");
		else
		System.out.println(s+" is not a palindrome");
		}
		}	
	
	
	
	

