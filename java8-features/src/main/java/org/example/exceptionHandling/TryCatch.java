package org.example.exceptionHandling;

public class TryCatch {

	private String tryCatchMethod() {

		try {

			System.out.println("Try block");

		} catch (Exception e) {

			System.out.println("Catch block");

		} finally {

			System.out.println("Finally block");
		}

		System.out.println("outer try catch");
		return "outer try catch";

	}

	private String tryCatchMethodWithReturn() {

		try {

			System.out.println("Try block");
			return "exit";

		} catch (Exception e) {

			System.out.println("Catch block");

		} finally {

			System.out.println("Finally block"); // with return this will be executed

		}

		System.out.println("outer try catch"); // this not be executed
		return "outer try catch";

	}
	private String tryCatchMethodWithSystemExit() {

		try {

			System.out.println("Try block");
			System.exit(0);

		} catch (Exception e) {

			System.out.println("Catch block");

		} finally {

			System.out.println("Finally block"); // not execute

		}

		System.out.println("outer try catch");
		return "outer try catch";
		
	}
	
	public static void main(String[] args) {
		TryCatch tryCatch = new TryCatch();

		System.out.println("Normal try-catch-finally");
		tryCatch.tryCatchMethod();

		System.out.println("Normal try-catch with return inside try block");
		tryCatch.tryCatchMethodWithReturn();

		System.out.println("Normal try-catch with system exit() inside try block");
		tryCatch.tryCatchMethodWithSystemExit();
	}

}
