package problems1to10;
/***
 * Largest palindrome product
 * 
 * Problem 4
 * 
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest
 * palindrome made from the product of two 3-digit numbers.
 * 
 ***/

public class Problem4 {

	public static void main(String[] args) {
		// Time computation
		final long startTime = System.nanoTime();

		// Program

		int palin = 0;
		int prod = 0;

		for (int i = 999; i > 100; i--) {
			for (int j = 999; j > 100; j--) {
				prod = i * j;
				if (isPalin(prod) && (prod > palin))
					palin = prod;
			}
		}

		System.out.println(palin);

		// Time computation
		final long duration = System.nanoTime() - startTime;
		System.out.println("Time: " + duration + " ns");
	}

	public static boolean isPalin(int n) {

		int palin = 0;
		int actual = n;

		while (n > 0) {
			int swap = n % 10;
			palin = palin * 10 + swap;
			n = n / 10;
		}

		return (actual == palin);
	}

}
