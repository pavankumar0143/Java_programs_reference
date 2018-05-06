
public class Exp17 {
	public static void main(String[] args){
		int sum=0,n;
		n=Integer.parseInt(args[0]);
		while(n>0)
		{
		sum=sum*10+n%10;
		n=n/10;
		}
		System.out.println(sum);
	}

}
