package main.java.com.nadee.Test1.scanners;

/**
 * Input Format
 * 	There is no input for this challenge.
 * 
 * Output Format
 * 	You must print two lines of output:
 * 		Print Hello, World. on the first line.
 * 		Print Hello, Java. on the second line.
 * 
 * Sample Output
 * 	Hello, World.
 * 	Hello, Java.
 * 
 * @author Nadee
 *
 */
public class StdoutPractice {

	public static void main(String[] args) {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
        
    }
	
	//Std library is not part of "installed java libraries" therefore in order to use it 
	//you have to download the Std library and declare it in your path. It works identical to Java Scanner class
	//	public static void main(String[] args) {
	//        StdOut.print("Type an int: ");
	//        int a = StdIn.readInt();
	//        StdOut.println("Your int was: " + a);
	//        StdOut.println();
	//    }
}
