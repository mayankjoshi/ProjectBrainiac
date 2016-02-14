package my.interview.questions;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		int n = 1000000;
		boolean[] isPrime = new boolean[n + 1];
		for (int i = 0; i < isPrime.length; i++) {
			isPrime[i] = true;
		}
		for (int i = 2; i * i <= n; i++) {
			if (isPrime[i]) {
				for (int j = i; i * j <= n; j++) {
					isPrime[i * j] = false;
				}
			}
		}
		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i]) {
				System.out.println(i);
			}
		}
	}

}
