package main.java.com.nadee.searching;

/**
 * Searching is the process of finding some particular element in the list
 * Linear search is also called as Sequential search algorithm
 * 
 * Here we simply traverse the list completely and match each element of the list with the item whose location is to be found
 * If the match found, then the location of the item is returned, otherwise the algorithm returns NULL
 * 
 * @author Nadee
 *
 */
public class LinearSearchExample1 {

	static int linearSearch(int a[], int val) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == val) {
				return i + 1;
			}
		}

		return -1;
	}
	
	public static void main(String[] args) {
		int a[] = { 29, 10, 41, 20, 45, 30, 40, 89 }; // unsorted array
		int val = 20; // value to be search

		int result = linearSearch(a, val);

		System.out.println();
		System.out.println("The elements of the arra are: ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}

		System.out.println();

		System.out.println("Element to be searched is: " + val);
		if (result == -1) {
			System.out.println("Element is not present in the array");
		} else {
			System.out.println("Element is present at " + result + " position of array");
		}
	}

}
