
public class Exp10 {
	public static void main(String args[]){
		int n,i,j,t=0;
		n=args.length;
		System.out.println("The given array is :");
		for(i=0;i<n/2;i++)
			{
			for(j=0;j<n/2;j++)
			{
				System.out.print(args[t++]+" ");
			}
			System.out.println();
			}
			System.out.println("The reverse of the array is :");
			for(i=n/2-1;i>=0;i--)
			{
				for(j=n/2-1;j>=0;j--)
				{
					System.out.print(args[--t]+" ");
				}
				System.out.println();
			}
		}
	}

