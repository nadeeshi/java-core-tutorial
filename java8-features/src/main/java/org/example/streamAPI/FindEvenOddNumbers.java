package org.example.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, find out all the even numbers exist in the list using Stream functions
 * @author Nadee
 *
 */
public class FindEvenOddNumbers {

	private void findEvenNumbers() {
		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		integerList.add(5);
		
		List<Integer> resutList = integerList.stream()
		.filter(e -> (e%2 == 0))
		.collect(Collectors.toList());
		
		System.out.println(resutList);
		
		 integerList.stream()
		.filter(number -> (number%2 == 0))
		.forEach(System.out::println);	
	}
	
	
	private void findOddNumbersFromArray() {
	//	Integer[] array = new Integer[5];
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		list.stream()
		.filter(number -> (number%2 != 0))
		.forEach(System.out::println);
	}
	
	
	
	public static void main(String args[]) {
		FindEvenOddNumbers test1 = new FindEvenOddNumbers();
		test1.findEvenNumbers();
		test1.findOddNumbersFromArray();
		
	}
}
