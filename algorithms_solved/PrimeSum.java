import java.util.HashSet;

public class PrimeSum {
	
	public static void genPrime(int n){
		boolean prime[]=new boolean[n+1];
		for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == false)
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    prime[i] = true;
            }
        }
		for(int i = 2; i <= n; i++)
        {
            if(prime[i] == false)
                System.out.print(i + " ");
        }
	}
	public static void main(String[] args) {
		genPrime(1000);
	}
}
