package main.java.com.nadee.datastructures.array;

/**
 * Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other arrays
 * ex: - int[][] arr = new int[3][3], 3 row and 3 column
 * 
 * @author Nadee
 *
 */
public class MultidimensionalArray {

	public static void main(String[] args) {
		// declaring and initializing 2D array
		int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
	}

}
