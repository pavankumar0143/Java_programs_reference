
public class Exp12 {

	public static void main(String [] args){
		int c=0,n=Integer.parseInt(args[0]);
		for(int i=2;i<n;i++){
			if(n%i==0)
				c++;
		}
		if(c!=0)
			System.out.println("not prime");
		else
			System.out.println("prime");
	}

}
