package org.example.optionalAPI;


import java.util.Optional;

public class OptionalClass {

	private static void optionalMethod() {
		Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;
        
        System.out.println(gender);
        System.out.println(gender.get());
        System.out.println(Optional.empty());
        System.out.println(Optional.of(answer1));
        System.out.println(Optional.of(answer1).get());

        System.out.println(Optional.ofNullable(answer1));
        System.out.println(Optional.ofNullable(answer2));
        
        // java.lang.NullPointerException
        System.out.println(Optional.of(answer2));
	}

	
	public static void main(String[] args) {
		optionalMethod();

	}

}
