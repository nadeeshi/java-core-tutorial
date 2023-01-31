package org.example.commonProblems.strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	private void reverseStringUsingBuilder() {
		String s = "Test String";
		
		String reverseString = new StringBuilder(s).reverse().toString();
		
		System.out.println("Builder result: " + reverseString);
	}

	private void reverseStringUsingStream() {
		String s = "Test String";
		
		String result = Stream.of(s) // convert string to sequential stream
		.map(word -> new StringBuilder(word).reverse())
		.collect(Collectors.joining(" "));
		
		System.out.println("Stream result: " + result);
	}
	
	
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		rs.reverseStringUsingStream();
		rs.reverseStringUsingBuilder();
		
	}

}
