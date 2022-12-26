package main.java.com.nadee.Test4.datatypes;

import java.util.Scanner;

/**
 * Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double.
 * For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):
 * 	A byte is an 8-bit signed integer.
 * 	A short is a 16-bit signed integer.
 * 	An int is a 32-bit signed integer.
 * 	A long is a 64-bit signed integer.
 * 
 * Input Format
 * 	The first line contains an integer, , denoting the number of test cases.
 * 	Each test case, , is comprised of a single line with an integer, , which can be arbitrarily large or small.
 * 
 * Output Format
 * 	For each input variable n and appropriate primitive dataType, you must determine if the given primitives are capable of storing it. If yes, then print:
 * 	n can be fitted in:
 * 		* dataType
 * 
 * If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: byte < short < int < long).
 * 
 * If the number cannot be stored in one of the four aforementioned primitives, print the line:
 * 	n can't be fitted anywhere.
 * 
 * @author Nadee
 *
 */
public class PrimitiveIntegerValuesTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Test cases: - ");
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println( x + " can be fitted in:");

				if(x >= -128 && x <= 127)
					System.out.println("* byte");

				// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
				if (Short.MIN_VALUE <= x && x <= Short.MAX_VALUE)
					System.out.println("* short");

				if (Integer.MIN_VALUE <= x && x <= Integer.MAX_VALUE)
					System.out.println("* int");

				if (Long.MIN_VALUE <= x && x <= Long.MAX_VALUE)
					System.out.println("* long");

			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}

	}

}
