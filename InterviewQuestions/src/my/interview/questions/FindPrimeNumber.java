package my.interview.questions;

public class FindPrimeNumber {
	
	
	public static void main(String args[]){
		
		FindPrimeNumber findPrimeNumber = new FindPrimeNumber();
		boolean array[] = new boolean [100];
		findPrimeNumber.findPrime(100, array);
		
	}
	
	
	private void findPrime(final int n, final boolean prime[]){
		
		prime[0] = false;
		  prime[1] = false;
		  int i;
		  for (i = 2; i < n; i++){
		    prime[i] = true;
		  }
		 int limit = (int) Math.sqrt(n);
		  for (i = 2; i <= limit; i++) {
		    if (prime[i]) {
		      for (int j = i * i; j <= n; j += i)
		        prime[j] = false;
		    }
		  }
		
	}

}
