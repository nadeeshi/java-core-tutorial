package org.example.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class GetMaximumNumber {
	
	private void getMaximum() {
		List<Integer> list = Arrays.asList(34, 45, 65, 47, 23, 78);

		Optional<Integer> max = list.stream()
				.max(Integer::compare);

		System.out.println("Maximum: " + max.orElse(0));


		// using comparator
		Optional<Integer> highest = Stream.of(1, 2, 3, 77, 6, 5)
                 .max(Comparator.comparing(Integer::valueOf));

		System.out.println("Highest: " + (highest.isPresent() ? highest.get() : 0));
	}
	
	private void getMinimum() {
		List<Integer> list = Arrays.asList(34, 67, 89, 43, 23);
		
		Optional<Integer> min = list.stream()
				.min(Integer::compare);

//		int min = list.stream()
//				.min(Integer::compare)
//				.get();

		System.out.println("Minimum: " + min.orElse(0));
	}
	

	public static void main(String[] args) {
		GetMaximumNumber gm = new GetMaximumNumber();
		gm.getMaximum();
		gm.getMinimum();
	}

}
