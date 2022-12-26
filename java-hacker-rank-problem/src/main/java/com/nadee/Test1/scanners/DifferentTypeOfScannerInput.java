package main.java.com.nadee.Test1.scanners;

import java.util.Scanner;

/**
 * Input Format
 * 	There are three lines of input:
 * 		The first line contains an integer.
 * 		The second line contains a double.
 * 		The third line contains a String.
 * 
 * Output Format
 * 	There are three lines of output:
 * 		On the first line, print String: followed by the unaltered String read from stdin.
 * 		On the second line, print Double: followed by the unaltered double read from stdin.
 * 		On the third line, print Int: followed by the unaltered integer read from stdin.
 * 
 * @author Nadee
 *
 */
public class DifferentTypeOfScannerInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Integert Value: ");
		int i = scan.nextInt();

		System.out.println("Enter Double Value: ");
		Double d = scan.nextDouble();
		
		scan.nextLine();
		System.out.println("Enter String Value: ");
		String s = scan.nextLine();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}

}
