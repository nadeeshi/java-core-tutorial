package org.example.commonProblems.numbers;

import java.util.stream.IntStream;

public class NumberPattern {

    public void printNumbersInRange(int start, int end) {
         IntStream.rangeClosed(start, end)
                .boxed()
                .map(number -> {
                    if (number % (3 * 5) == 0) {
                        return "FizzBuzz";
                    } else if (number % 3 == 0) {
                        return "Fizz";
                    } else if (number % 5 == 0) {
                        return "Buzz";
                    } else {
                        return number;
                    }
                })
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        NumberPattern numberPattern = new NumberPattern();
        numberPattern.printNumbersInRange(1, 100);
    }
}
