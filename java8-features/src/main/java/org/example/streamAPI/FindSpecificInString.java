package org.example.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSpecificInString {
	
	
	// Find element end with "ee" string
	private void findSpecificEndCharacter() {
		List<String> list = Arrays.asList("Nadee", "Madu", "Kamal");
		
		List<String> result = list.stream()
		.filter(word -> word.endsWith("ee"))
		.collect(Collectors.toList());
		
		System.out.println(result);
	}
	
	// Find substring and replace it using another string
	private void findSpecificWordInString() {
		List<String> list = Arrays.asList("Nadee", "Test", "Kamal");
		
		list.stream()
		.filter(word -> word.contains("dee"))
		.map(word -> word.replace("dee", "eed"))
		.forEach(System.out::println);
	}
	
	
	public static void main(String[] args) {
		FindSpecificInString test = new FindSpecificInString();
        test.findSpecificEndCharacter();
		test.findSpecificWordInString();
	}

}
