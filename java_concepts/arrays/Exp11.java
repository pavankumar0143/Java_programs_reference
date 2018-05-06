
public class Exp11 {
	public static void main(String args[]){
	int n=args.length;
	if(n==9){
		int k=0;int max=Integer.parseInt(args[0]);
		int[][]a=new int[n/3][n/3];
		for(int i=0;i<n/3;i++){
			for(int j=0;j<n/3;j++){
				a[i][j]=Integer.parseInt(args[k]);
				k++;
			}
			
		}
		System.out.println("The given array");
		for(int i=0;i<n/3;i++){
			for(int j=0;j<n/3;j++){
				System.out.print(a[i][j]+" ");
				}
			System.out.println();
		}
		for(int i=0;i<n/3;i++){
			for(int j=0;j<n/3;j++){
				if(a[i][j]>max){
					max=a[i][j];
				}
			}
		}
		System.out.println("Max= "+max);
	}
	else
		System.out.println("Please enter 9 arguments");
  }
}
