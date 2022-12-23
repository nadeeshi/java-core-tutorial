package main.java.com.nadee.numbers;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, a=0, b=0, c=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of items");
		num = in.nextInt();
		
		for(int i=0; i < num; i++) {
			a= b;
			b= c;
			c= a + b;
			System.out.print(a + " ");
		}
	}

}
