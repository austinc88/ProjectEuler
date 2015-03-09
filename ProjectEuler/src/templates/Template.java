package templates;

public class Template {

	public static void main(String[] args) {
		// Time computation
		final long startTime = System.nanoTime();
		
		// Program
		int result = 1;

		System.out.println("Result: " + result);
		
		// Time computation
		final long duration = System.nanoTime() - startTime;
		System.out.println("Time: " + duration + " ns");
	}
}
