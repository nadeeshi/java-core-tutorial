package main.java.com.nadee.numbers;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;

		System.out.println("Enter X and Y");
		Scanner in = new Scanner(System.in);

		x = in.nextInt();
		y = in.nextInt();

		System.out.println("Before swap :- " + x + y);

		swapNumbers(x, y);
		swapNumbersWithoutUsingVeriable(x, y);

	}
	
	// swap two numbers using the third variable
	private static void swapNumbers(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;

		System.out.println("After Swap:- " + x + y);
	}

	// swap two numbers without using the third variable
	private static void swapNumbersWithoutUsingVeriable(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After swap without variable :- " + x + y);
	}

}
