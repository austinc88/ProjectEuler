package problems1to10;
/***
 * Smallest multiple
 * 
 * Problem 5
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder. What is the smallest positive number that is
 * evenly divisible by all of the numbers from 1 to 20?
 * 
 ***/

// Implements Sieve of Eratosthenes
public class Problem5 {

	public static void main(String[] args) {
		// Time computation
		final long startTime = System.nanoTime();

		// Program
		int n = 20;
		int result = 1;

		// Initializes the Sieve
		boolean[] isPrime = new boolean[n + 1];
		// Initially assumes all integers in Sieve are prime, true = prime
		// isPrime[1] = false; 1 is not a prime number
		for (int i = 2; i <= n; i++)
			isPrime[i] = true;

		// Check every number >= 2 for primality
		for (int currentPrime = 2; currentPrime <= n; currentPrime++) {

			// currentPrime is prime if hasn't been 'crossed off' yet; won't
			// enter unless it hasn't been crossed
			if (isPrime[currentPrime]) {

				// Keeps track of number of times value appears
				int maxAmount = 0;

				// 'cross off' all subsequent multiples of currentPrime
				for (int j = 1; currentPrime * j <= n; j++) {
					// 'cross off'
					isPrime[currentPrime * j] = false;

					// keeps track of number of times value appears
					int amount = 1;
					// Temporary variable to keep track of how many divisions
					int num = j;

					// keeps diving num by currentPrime until modulo is not 0
					while (num % currentPrime == 0) {
						num = num / currentPrime;
						// increments the accumulator to display the number of
						// times this has appeared
						amount++;
					}

					// updates the value of maxAmount - lexical scoping
					if (amount > maxAmount)
						maxAmount = amount;
				}

				// Multiplies the result by the number of times the currentPrime
				// appears in t

				for (int j = 1; j <= maxAmount; j++)
					result *= currentPrime;
			}
		}

		System.out.println(result);
		
		// Time computation
		final long duration = System.nanoTime() - startTime;
		System.out.println("Time: " + duration + " ns");
	}
}
