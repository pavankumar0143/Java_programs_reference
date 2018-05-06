import java.util.Scanner;

public class SumEqualsToPrime {



	int isp ( int n ) {
		int i ;
		for ( i = 2 ; i * i <= n ; i ++) if ( n % i == 0 ) return 0 ; 	 	 
		return 1 ; 
	}
	public static void main ( String [] args ) {  
		SumEqualsToPrime hg = new SumEqualsToPrime (); 
		Scanner in = new Scanner ( System . in );    	
		 
			int n = in . nextInt (); 
			if ( hg . isp ( n ) == 1 ) 
				System . out . println ( "1" );  	
				else {
					if ( hg . isp ( n - 2 ) == 1 || n % 2 == 0 ) 
						System . out . println ( "2" );       	
						else 
							System . out . println ( "3" );	
				}
		}
	}
