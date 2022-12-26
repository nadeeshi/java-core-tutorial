package main.java.com.nadee.Test3.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Task
 * 	Given an integer, N , print its first 10 multiples. Each multiple N * i (where 1 <= i <= 10) should be printed 
 * on a new line in the form: N x i = result.
 * 
 * Input Format
 * 	A single integer, N.
 * 
 * Constraints
 * 	2 <= N <= 20
 * 
 * Output Format
 * 	Print 10 lines of output; each line i (where 1 <= i <= 10) contains the result of N * i in the form:
 * 		N x i = result.
 * 
 * @author Nadee
 *
 */
public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		try {
			int N = Integer.parseInt(bufferedReader.readLine().trim());

			for (int i = 1; i <= 10; i++) {
				System.out.println(N + " x " + i + " = " + (N * i));
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
