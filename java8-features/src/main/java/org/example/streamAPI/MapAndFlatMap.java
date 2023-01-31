package org.example.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
	
	private static void mapFunction() {
		List<String> list = Arrays.asList("Nadee", "Test", "Home", "Kamal");
		
		list.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		list.stream()
		.map(String::toLowerCase)
		.forEach(System.out::println);
	}
	
	private static void flatMapWithIntegers() {
		List<List<Integer>> list =  Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
	            
		List<Integer> result = list.stream()
							.flatMap(List::stream)
							.map(integer -> integer + 1)
							.collect(Collectors.toList());
		
		result.forEach(System.out::println);
	}
	
	private static void flatMapWithString() {
		List<List<String>> list = Arrays.asList(Arrays.asList("Saket", "Trevor"), Arrays.asList("John", "Michael"),
                								Arrays.asList("Shawn", "Franklin"), Arrays.asList("Johnty", "Sean"));
		 List<String> result = list.stream()
				 			.flatMap(List::stream)
				 			.map(String::toUpperCase)
				 			.collect(Collectors.toList());
		
		 result.forEach(System.out::println);
	}
	
	public static void main(String[] args) { 
		mapFunction();
		flatMapWithIntegers();
		flatMapWithString();
	}

}
