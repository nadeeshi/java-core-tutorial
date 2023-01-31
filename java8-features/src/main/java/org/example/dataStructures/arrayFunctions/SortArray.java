package org.example.dataStructures.arrayFunctions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {
	private void sortArray() {
		List<Integer> list = Arrays.asList(34, 56, 32, 52, 12, 1, 12);
		
		list.stream()
		.sorted()
		.forEach(e -> {
			System.out.print(e+ " ");
		});
	}
	private void reverseOrderArray() {
		List<Integer> list = Arrays.asList(34, 56, 32, 52, 12, 1, 12);
		
		list.stream()
		.sorted(Collections.reverseOrder())
		.forEach(number -> {
			System.out.print(number + " ");
		});
		
	}
	public static void main(String[] args) {
		SortArray sa = new SortArray();
		System.out.print("sorted order: ");
		sa.sortArray();

		System.out.println("\n");
		System.out.print("reversed order: ");
		sa.reverseOrderArray();
	}

}
