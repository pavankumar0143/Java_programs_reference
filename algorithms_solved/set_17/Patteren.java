package set_17;

public class Patteren {

	static void printPattern(String s){
		int n=s.length();
		int spaces=n;
		for(int i = 0;i<n ;i++){
			   //Print spaces very first
			   for(int j = 0;j<spaces;j++)
			       System.out.print(" ");
			   //Print last part of word
			   for(int j = n/2 ;j<=n/2+i;j++)
			      if(j<n)
			       System.out.print(s.charAt(j));
			   //Print starting part of word
			   if(i>n/2){
			      for(int j = 0;j<i-n/2;j++)
			      System.out.print(s.charAt(j));
			   }
			 System.out.println();	
			 spaces -= 1;
			  }
	}
	public static void main(String[] args) {
		printPattern("PROGRAM");
	}
}
