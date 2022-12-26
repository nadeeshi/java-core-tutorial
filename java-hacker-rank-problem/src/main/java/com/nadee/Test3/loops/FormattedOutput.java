package main.java.com.nadee.Test3.loops;

import java.util.Scanner;

/**
 * Input Format
 * 	Every line of input will contain a String followed by an integer.
 * 	Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .
 * 
 * Output Format
 * 	In each line of output there should be two columns:
 * 		The first column contains the String and is left justified using exactly 15 characters.
 * 		The second column contains the integer, expressed in exactly 3 digits; 
 * 			if the original input has less than three digits, you must pad your output's leading digits with zeroes.
 * Each String is left-justified with trailing whitespace through the first 15 characters
 * 
 * Sample Input
 * 	java 100
 * 	cpp 65
 * 	python 50
 * 
 * Sample Output
 * 	================================
 * 	java           100 
 * 	cpp            065 
 * 	python         050 
 * ================================
 * 
 * @author Nadee
 *
 */
public class FormattedOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // Complete this line
            String formattedNumber = String.format("%03d", x);  // => "001"
            
            
            int whiteSpacestoadd = 15 - s1.length();
            //String padded = String.format("%-20s", s1);
            System.out.print(s1);
            
            //String s = "";
            for(int j = whiteSpacestoadd; j>0; j--)
            {
               // s+= " ";
                System.out.print(" ");
            }
            
            //System.out.print(s1);
            
            System.out.println(formattedNumber);
        }
        System.out.println("================================");

	}

}
