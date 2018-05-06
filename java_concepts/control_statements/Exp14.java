
public class Exp14 {

	public static void main(String [] args){
		if(args.length>0){
		int c=0,n=Integer.parseInt(args[0]);
		if(n==0){
			System.out.println("0 is not a prime or compossite number");
		}
		for(int i=2;i<n;i++){
			if(n%i==0)
				c++;
		}
		if(c!=0)
			System.out.println("not prime");
		else
			System.out.println("prime");
	 }
		else
			System.out.println("Expected a integer number");
	}	

}

