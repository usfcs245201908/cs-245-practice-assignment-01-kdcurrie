/**
 * Practice 01 Test
 * CS 245 - First practice assignment
 * Implementation of factorial and Fibonacci functions.
 * @author dbrizan
 *
 */
public class Practice01Test {
	
	protected String [] types;


	/*
	 * Constructor for the class.
	 */
	public Practice01Test () {
		types = new String [] {"recursive", "iterative"};
	}


	/*
	 * This function tests three sample values of the factorial function.
	 */
	public boolean testPositiveFactorial(Practice01Math math) {
		int[][] expectedValues = {{1, 1}, {4, 24}, {10, 3628800}};
		
		for (int i = 0; i < expectedValues.length; i++) {
			try {
				if (math.fact(expectedValues[i][0]) != expectedValues[i][1])
					return false;
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}


	/*
	 * This function tests one negative case of the factorial function (expected to fail).
	 */
	public boolean testNegativeFactorial(Practice01Math math) {
		try {
			math.fact(-1);
		} catch (Exception e) {
			return true;
		}
		
		return false;
	}


	/*
	 * This function tests four sample values of the Fibonacci function.
	 */
	public boolean testPositiveFibonacci(Practice01Math math) {
		int[][] expectedValues = {{0, 0}, {1, 1}, {4, 3}, {10, 55}};
		
		for (int i = 0; i < expectedValues.length; i++) {
			try {
				if (math.fib(expectedValues[i][0]) != expectedValues[i][1])
					return false;
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}


	/*
	 * This function tests one negative case of the Fibonacci function (expected to fail).
	 */
	public boolean testNegativeFibonacci(Practice01Math math) {
		try {
			math.fact(-1);
		} catch (Exception e) {
			return true;
		}
		
		return false;
	}


	/*
	 * This function tests the general correctness of the functions we care about.
	 */
	public void testCorrectness() {
		int grade = 0;
		System.out.println("Testing correctness.");
		Practice01Factory factory = new Practice01Factory();
		
		
		try {
			for (String implementationType : types) {
				Practice01Math math = factory.get(implementationType);
				
				if (testPositiveFactorial(math)) {
					System.out.println("[+20%] Correct calculations of factorial function.");
					grade += 20;
				} else {
					System.out.println("[    ] Incorrect implementation of factorial function.");
				}
				
				if (testNegativeFactorial(math)) {
					System.out.println("[+ 5%] Correct calculations of factorial function.");
					grade += 5;
				} else {
					System.out.println("[    ] Incorrect implementation of factorial function.");
				}

				if (testPositiveFibonacci(math)) {
					System.out.println("[+20%] Correct calculations of Fibonacci function.");
					grade += 20;
				} else {
					System.out.println("[    ] Incorrect implementation of Fibonacci function.");
				}
				
				if (testNegativeFibonacci(math)) {
					System.out.println("[+ 5%] Correct calculations of Fibonacci function.");
					grade += 5;
				} else {
					System.out.println("[    ] Incorrect implementation of Fibonacci function.");
				}
			}
		} catch (Exception e) {
			System.out.println("[    ] Giving up. Stack trace as follows");
			e.printStackTrace();
		}
		
		System.out.println("Grade for this assignment: " + grade + "%");
	}


	/*
	 * This is a stub for testing the timing.
	 * - Use it to compare recursion vs. iteration.
	 * - Wall clock speed is sufficient for now. 
	 */
	public void testPerformance() {
		System.out.println("Advanced: implement the speed test.");
	}

	
	/*
	 * Main...
	 */
	public static void main(String[] args) {
		Practice01Test test = new Practice01Test();
		test.testCorrectness();
	}

}
