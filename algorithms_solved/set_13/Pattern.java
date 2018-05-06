package set_13;

public class Pattern {
 static void genPattern(int n){
	 int i=0;int k=0;
	 for(i=0;i<n;i++){
		 k=n+1;
		 if(i<n/2){
			 for(int j=0;j<=i;j++){
				 k=k-1; System.out.print(k);
			 }
			 for(int j=i+1;j<=n-i-1;j++){
				 System.out.print(k);
			 }
			 for(int j=n-i;j<n;j++){
				 k=k+1; System.out.print(k);
			 }
			 	
	 }
		 else{
			 for(int j=0;j<(n-i);j++){
				 k=k-1; System.out.print(k);
			 }
			 for(int j=n-i;j<i-1;j++){
				 System.out.print(k);
			 }
			 for(int j=i;j<n;j++){
				 k=k+1; System.out.print(k);
			 }
			
			}
		 System.out.println();
	 }
 }
	
 public static void main(String[] args) {
	genPattern(6);
}
}
