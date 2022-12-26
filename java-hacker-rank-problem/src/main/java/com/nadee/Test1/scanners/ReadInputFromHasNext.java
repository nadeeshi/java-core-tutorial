package main.java.com.nadee.Test1.scanners;

import java.util.Scanner;

/**
 * The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
 * Hint: Java's Scanner.hasNext() method is helpful for this problem.
 * 
 * Input Format
 * 	Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
 * 
 * Output Format
 * 	For each line, print the line number, followed by a single space, and then the line content received as input.
 * 
 * Sample Input
 * 	Hello world
 * 	I am a file
 * 	Read me until end-of-file.
 * 
 * Sample Output
 * 	1 Hello world
 * 	2 I am a file
 * 	3 Read me until end-of-file.
 * 
 * @author Nadee
 *
 */
public class ReadInputFromHasNext {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of input lines:- ");
		
		int i=1;
		// https://www.javatpoint.com/post/java-scanner-hasnext-method
        while (scan.hasNext()) {
        	String  s = scan.nextLine();
        	System.out.println(i + " " + s);
        	i++;
        }
	}

}
