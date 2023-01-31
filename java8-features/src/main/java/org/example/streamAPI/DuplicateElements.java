package org.example.streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	private void removeDuplicateString() {
		List<String> list = Arrays.asList("Cat", "Dog", "Cat", "Cat", "Monkey");
		
		List<String> result = list.stream()
		.distinct()
		.collect(Collectors.toList());
		
		result.forEach(e -> System.out.println(e));
	}
	
	private void removeDuplicateIntegers() {
		List<Integer> list = Arrays.asList(23, 56, 76, 45, 23, 56);
		
		Set<Integer> result = new HashSet<>(list);
		
		result.forEach(e -> System.out.println(e));
	}
	
	private void findDuplicateIntegers() {
		List<Integer> list = Arrays.asList(23, 56, 76, 45, 23, 23, 56);
		Set<Integer> resultList = new HashSet<>();
		
		list.stream()
		.filter(e -> !resultList.add(e))
		.forEach(System.out::print);
		
	}
	
	public static void main(String[] args) {
		DuplicateElements test = new DuplicateElements();
		test.removeDuplicateString();
        test.removeDuplicateIntegers();
        test.findDuplicateIntegers();
	}

}
