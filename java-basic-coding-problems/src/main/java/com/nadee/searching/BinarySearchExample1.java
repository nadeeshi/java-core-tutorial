package main.java.com.nadee.searching;

/**
 * Binary search is the search technique that works efficiently on Sorted lists.
 * To search an element into some list using the binary search, we must ensure that list is sorted.
 * 
 * Binary search follows the divide and conquer approach in which the list is divided into two halves, 
 * and the item is compared with the middle element of the list
 * 
 * If the match is found then, the location of the middle element is returned.
 * Otherwise, we search into either of the halves depending upon the result produced through the match.
 * 
 * If array is not sorted, we must need to sorted array first in order to do binary search.
 * 
 * @author Nadee
 *
 */
public class BinarySearchExample1 {

	static int binarySearch(int a[], int beg, int end, int val) {
		int mid;
		if (beg <= end) {
			mid = (beg + end) / 2;

			if (a[mid] == val) {
				return mid + 1;
			} else if (a[mid] < val) {
				return binarySearch(a, mid + 1, end, val);
			} else {
				return binarySearch(a, beg, mid - 1, val);
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 8, 10, 22, 27, 37, 44, 49, 55, 70 };
		int val = 37;

		int n = a.length;
		int result = binarySearch(a, 0, n - 1, val);

		System.out.print("The elements of the array are: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		System.out.println("Element to be search is: " + val);
		if (result == -1) {
			System.out.println("Element is not present in the array");
		} else {
			System.out.println("Element is present at " + result + " position of array");
		}
	}

}
