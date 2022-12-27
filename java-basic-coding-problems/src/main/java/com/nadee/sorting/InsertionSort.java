package main.java.com.nadee.sorting;

/**
 * The idea behind the insertion sort is that first take one element, iterate it through the sorted array.
 * 		step 1 - if the element is the first element, assume that it is already sorted, return 1.
 * 		step 2 - pick the next element, and store it separately in a key
 * 		step 3 - Now, compare the key with all elements in the sorted array.
 * 		step 4 - if the element in the sorted array is smaller than current element, then move to the next element.
 * 				else, shift greater elements in the array towards the right
 * 		step 5 - insert the value
 * 		step 6 - Repeat until the array is sorted
 * 
 * 
 * Although it is simple to use, it is not appropriate for large data sets as the time complexity of insertion sort in the average case and worse case is O(n*2)
 * This algorithms is less efficient than the other sorting algorithm like heap sort, quick sort, merge sort.
 * 
 * This follows incremental approach, and this is an in-place sorting algorithm
 * 
 * @author Nadee
 *
 */
public class InsertionSort {

	void insert(int a[]) {
		int i, j, temp;
		int n = a.length;

		for (i = 1; i < n; i++) {
			temp = a[i];
			j = i - 1;

			// Move elements of arr[0..i-1], that are greater than key, 
			// to one position ahead of their current position
			while (0 <= j && temp <= a[j]) {
				// if two elements are not correct position, then j position element is swap
				// with swapping, insertion sort will also check it with all elements in the sorted array
				a[j + 1] = a[j]; 
				j = j - 1;
				
			}

			a[j + 1] = temp;
		}
	}

	void printArr(int a[]) {
		int i;
		int n = a.length;

		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

	public static void main(String[] args) {
		int a[] = { 92, 50, 5, 20, 11, 22 };

		InsertionSort insertionSort = new InsertionSort();

		System.out.println("\nBefore sorting array elements: ");
		insertionSort.printArr(a);

		System.out.println("\n\nAfter sorting array elements: ");
		insertionSort.insert(a);
		insertionSort.printArr(a);
	}

}
