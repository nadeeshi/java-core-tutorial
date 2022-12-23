package main.java.com.nadee.strings;

/**
 * @author Nadee
 *
 */
public class ReverseString {

	public static void main(String args[]) {
		String input = "NadeeSenavirathna";

		String reverseString1 = reverseStringUsingStringBuilderFuction(input);
		String reverseString2 = reverseStringWithoutUsingBuilderFuction(input);

		System.out.println("reverseStringUsingStringBuilderFuction " + reverseString1);
		System.out.println("reverseStringWithoutUsingBuilderFuction " + reverseString2);

	}

	
	// inbuilt function of the string builder (reverse())
	private static String reverseStringUsingStringBuilderFuction(final String input) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(input);

		// used string builder to reverse
		stringBuilder.reverse();

		return stringBuilder.toString();
	}

	
	// reverse a string without using String inbuilt function reverse()
	private static String reverseStringWithoutUsingBuilderFuction(final String input) {

		char[] charArray = input.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = charArray.length - 1; i>=0; i--) {
			// System.out.print(charArray[i]);
			// reverseArray[i] = charArray[i];
			stringBuilder.append(charArray[i]);
		}

		return stringBuilder.toString();
	}
	
}


