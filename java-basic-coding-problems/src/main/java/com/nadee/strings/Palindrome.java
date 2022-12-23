package main.java.com.nadee.strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "";
		int length;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your number or string:-");
		original = in.nextLine();

		length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		System.out.println("Reverse is" + reverse);

		if (original.equals(reverse)) {
			System.out.println("Input is a Palindrome");
		} else {
			System.out.println("Input is not a Palindrome");
		}
	}

}
