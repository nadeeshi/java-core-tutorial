package main.java.com.nadee.numbers;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp, number;
		boolean isPrime = true;
		
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		in.close();
		
		for(int i = 2; i <= number/2; i++) {
			//temp will get remainder
			temp = number%i;
			if(temp == 0) {
				isPrime = false;
				break;
			}
			
		}
		
		if(isPrime) {
			System.out.print("Number is a Prime");
		}else {
			System.out.print("Number is not a Prime");
		}
	}

}
