package org.example.commonProblems.numbers;

public class DivideByZero {

	private static double divideByDoubleZero() {
		
		System.out.println("output" + (1.0/0.0));
		return 1.0/0.0 ;
	}
	
	private static double divideByZero() {
		
		System.out.println("output" + (1.0/0)); // Infinity
		System.out.println("output" + (1.0/0.0)); // Infinity
		
		System.out.println("output" + (0.0/0)); // NaN - not a number
		System.out.println("output" + (0.0/0.0)); // NaN
		
		System.out.println("output" + (1/0));  // dividing integers by 0 get ArithmeticException in runtime
		System.out.println("output" + (0/0)); // dividing integers by 0 get ArithmeticException in runtime

		return 1.0/0;
	}
	
	private static double divideByNull() {
		
	//	System.out.println("output" + (1.0/null)); // compile time error
		
		return 1.0;
	}
	
	public static void main(String[] args) {
		divideByDoubleZero();
		divideByZero();
		
	}

}
