package org.example.streamAPI;

import java.util.Arrays;
import java.util.List;

public class FindSpecificNumberInList {

	//Given the list of integers, find the first element of the list
	private void findFirstElement() {
		List<Integer> list = Arrays.asList(34, 56, 78, 34, 23);
		
		list.stream()
		.findFirst()
		.ifPresent(System.out::println);
		
		boolean result = list.stream()
		.anyMatch(e -> (e > 50));
		
		System.out.println("Has values greater than 50 " + (result? "true" : "false"));
	}

	// Given a list of integers, find out all the numbers starting with 1 using Stream functions
	private void findSpecificNumbers() {
		List<Integer> list = Arrays.asList(1, 1123, 345, 314); 
		
		list.stream()
		//.map(s -> s + "")
		.map(e -> e.toString())
		.filter(e -> e.startsWith("1"))
	   //	.map(n -> n.concat("test"))
		.forEach(System.out::println);
	}
	
	
	public static void main(String[] args) {
		FindSpecificNumberInList test = new FindSpecificNumberInList();
		test.findSpecificNumbers();
        test.findFirstElement();
	}

}
