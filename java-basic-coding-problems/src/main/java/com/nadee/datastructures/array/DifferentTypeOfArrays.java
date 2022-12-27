package main.java.com.nadee.datastructures.array;

/**
 * When an array is declared, only a reference of an array is created.
 * To create or give memory to the array, you need to use new to allocate an array,
 * 	you must specify the type and number of elements to allocate
 * 
 * Different type of array declarations
 * 	1. datatype[] arrName
 * 	2. datatype arrName[]
 * 	3. datatype [] arrName
 * 
 * @author Nadee
 *
 */
public class DifferentTypeOfArrays {

	public static void main(String[] args) {
		DifferentTypeOfArrays differentTypeOfArrays = new DifferentTypeOfArrays();
		
		differentTypeOfArrays.createIntegerArray();
		
		

	}

	private void createIntegerArray() {
		int[] arr; // declares an array of integers
		arr = new int[5]; // allocating memory for 5 integers
		
		/*
		 the size of the array and variables of the array are already known, array literals can be used
			int[] intArray = new int[]{ 10, 20, 30, 40, 50 }; 
		
		different type of array 
			int[] arr;
			int arr[];
			int [] arr;
		*/
		
		// initialize the elements of the array
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		//accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at index " + i + " : " + arr[i]);
		}
	}
}
