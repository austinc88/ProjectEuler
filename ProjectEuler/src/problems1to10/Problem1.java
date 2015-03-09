package problems1to10;
/***
 * Multiples of 3 and 5
 * 
 * Problem 1
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the
 * multiples of 3 or 5 below 1000.
 * 
 ***/

// Brute Force
public class Problem1 {

	public static void main(String[] args) {
		// Time computation
		final long startTime = System.nanoTime();
		
		// Program
		int sum = 0;

		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		System.out.println(sum);
		
		// Time computation
		final long duration = System.nanoTime() - startTime;
		System.out.println("Time: " + duration + " ns");
	}

}

// Could try using Arithmetic Progression Sums
// e.g. (sum of multiples of 3) + (sum of multiples of 5) – (sum of multiples of
// 15)