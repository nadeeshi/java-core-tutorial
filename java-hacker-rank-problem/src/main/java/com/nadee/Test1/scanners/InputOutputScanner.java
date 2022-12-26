package main.java.com.nadee.Test1.scanners;

import java.util.Scanner;

/**
 * Task
 * We need to read 3 integers from stdin and then print them to stdout. 
 * Each integer must be printed on a new line.
 * 
 * Input Format
 * 	There are 3 lines of input, and each line contains a single integer.
 * 
 * Sample Input
 * 	42
 * 	100
 * 	125
 * 
 * Sample Output
 * 	42
 * 	100
 * 	125
 * 
 * @author Nadee
 *
 */
public class InputOutputScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
	}

}


