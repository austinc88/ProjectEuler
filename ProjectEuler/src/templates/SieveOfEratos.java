package templates;

public class SieveOfEratos {

	public static void main(String[] args) {

		// Time computation
		final long startTime = System.nanoTime();

		int N = 20;
		// init numbers array, where true denotes primality
		boolean[] isPrime = new boolean[N + 1];

		// init possible primes
		// isPrime[0] = false; // 1 is not prime
		for (int i = 2; i < N; i++) {
			isPrime[i] = true;
		}

		// check every number >= 2 for primality
		for (int i = 2; i <= N; i++) {
			// i is prime if it hasn't been "crossed off" yet
			if (isPrime[i]) {
				// print out the prime number
				System.out.println(i);
				// "cross off" all the subsequent multiples of i
				for (int j = 1; j * i <= N; j++) {
					isPrime[i * j] = false;
				}
			}
		}

		// Time computation
		final long duration = System.nanoTime() - startTime;
		System.out.println("Time: " + duration + " ns");
	}

}
