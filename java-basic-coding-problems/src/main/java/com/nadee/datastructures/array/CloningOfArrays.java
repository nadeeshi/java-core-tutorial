package main.java.com.nadee.datastructures.array;

/**
 * A deep copy is performed with the new array containing copies of the original arrya's elements as opposed to references
 * 
 * @author Nadee
 *
 */
public class CloningOfArrays {

	public static void main(String[] args) {
		int intArray[] = { 1, 2, 3 };
		int cloneArray[] = intArray.clone();

		System.out.println(intArray == cloneArray);

		for (int i = 0; i < cloneArray.length; i++) {
			System.out.print(cloneArray[i] + " ");
		}
	}

}
