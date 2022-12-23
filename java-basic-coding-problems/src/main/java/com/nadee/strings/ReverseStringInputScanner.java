package main.java.com.nadee.strings;
import java.util.Scanner;

public class ReverseStringInputScanner {
	
	public static void main(String args[]) {
		String str;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your String");
		
		str = input.nextLine();
		
		String[] token = str.split("");
		
		for(int i = token.length - 1; i>=0; i--) {
			System.out.print(token[i]+"");
		}
	}

}
