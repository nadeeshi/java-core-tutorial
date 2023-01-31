package org.example.commonProblems.numbers;

import java.util.Arrays;
import java.util.List;

public class MaxSum {

	private static int findMaxSum(List<Integer> list) {
		 // find sum of largest 2 numbers using Stream.skip(); method
		return list
                .stream()
                .sorted()
                .skip(list.size() - 2)
                .reduce(0, Integer::sum);
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 9, 7, 11);
        // Should return 20, since 9 and 11 are the largest elements
        // and their sum is 20
        System.out.println(findMaxSum(list));
	}

}
