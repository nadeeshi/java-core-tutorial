package org.example.scanner;

import java.util.Scanner;

/**
 * Implement console input 
 * @author Nadee
 *
 */
public class InputScanners {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your Name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter your Country: ");
		String country = scanner.next();
		
		System.out.print("Entry your Age: ");
		int age = scanner.nextInt();
		
		System.out.println("Your Name is: " + name);
		System.out.println("Your Country is: " + country);
		System.out.println("Your Age is: " + age);
	}

	// If we enter wrong type input, then we get runtime exception, InputMisMatchException
	
	/*
	 *  Different between nextLine() and next()
	 *  nextLine() -> will return entire line of text
	 *  next() -> will return only single word at the time
	 *  
	 * 	Enter your Name: Nadee senavi
		Enter your Country: Sri Lanka
		Your Name is: Nadee senavi
		Your Country is: Sri
	 */
}
