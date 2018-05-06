
public class Exp9 {
	public static void main(String args[]){
		int k,m,n,i,sum=0;
		m=0;
		k=0;
		n=args.length;
		int a[]=new int[n+1];
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(i=0;i<n;i++){
			if(a[i]==6){
				i++;
				while((a[i]!=7)&&(i<n)){
					m=m+a[i];
					i++;
				}
				if(a[i]==7)
				{
					m=0;
					i--;
				}
				else
					m=m+6;
			}
			else if(a[i]==7){
				i++;
				while((a[i]!=6)&&(i<n)){
					k=k+a[i];
					i++;
				}
				if(a[i]==6)
				{
					k=0;
					i--;
				}
				else
					m=m+7;
			}	
			else
				sum=sum+a[i];
		}
		System.out.println(sum+m+k);
		}
	}
