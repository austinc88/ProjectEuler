package problems1to10;
/***
 * Largest prime factor
 * 
 * Problem 3
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
 * factor of the number 600851475143 ?
 * 
 ***/

// Prime numbers of 10 are: 1, 2, 5, 10
// Prime numbers of 100 are: 1, 2, 4, 5, 10, 20, 25, 50, 100

// Middle point of prime number is square root

// More 'elegant': 170857 ns
// Any integer greater than 1 is either a prime number, or can be written as a
// unique product of prime numbers (ignoring the order).
public class Problem3 {

	public static final double NUMBER = 600851475143D;

	public static void main(String[] args) {
		// Time computation
		final long startTime = System.nanoTime();

		double newnum = NUMBER;
		int fact = 0;

		int counter = 2;
		while (counter * counter <= newnum) {
			if (newnum % counter == 0) {
				newnum = newnum / counter;
				fact = counter;
			} else {
				counter++;
			}
		}

		if (newnum > fact)
			fact = (int) newnum;

		System.out.println(fact);

		// Time computation
		final long duration = System.nanoTime() - startTime;
		System.out.println("Time: " + duration + " ns");
	}
}

/*
 * // Brute Force: 13691081 ns public class Problem3 {
 * 
 * public static final double NUMBER = 600851475143D;
 * 
 * public static void main(String[] args) { // Time computation final long
 * startTime = System.nanoTime();
 * 
 * // Program int prime = 1; int sqrRoot = (int) Math.sqrt(NUMBER);
 * 
 * for (int i = 2; i <= sqrRoot; i++) { if (NUMBER % i == 0 && isPrime(i)) prime
 * = i; }
 * 
 * System.out.println(prime);
 * 
 * // Time computation final long duration = System.nanoTime() - startTime;
 * System.out.println(duration); }
 * 
 * 
 * // Returns whether or not value is prime public static boolean isPrime(int n)
 * {
 * 
 * int root = (int) Math.sqrt(n);
 * 
 * for (int i = 2; i <= root; i++) { if (n % i == 0) return false; }
 * 
 * return true;
 * 
 * }
 * 
 * }
 */

