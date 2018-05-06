
public class Exp19 {
	public static void main(String args[]){
		int t=1,n=1;
		while(t<=5){
			if((n%2==0)&&(n%3==0)&&(n%5==0))
				{
					System.out.print(n+" ");
					t++;
				}
			n++;
		}
	}

}
