package main.java.com.nadee.datastructures.list.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * List provide the facility to maintain the Ordered collection
 * This contain index-based methods to insert, update, delete and search the elements
 * It can have the duplicate elements also.
 * We can also store the null elements in the list
 * 
 * @author Nadee
 *
 */
public class JavaListExample1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Banana");
		list.add("Mango");
		list.add("Apple");
		list.add("Orange");

		for (String fruit : list) {
			System.out.println(fruit);
		}
	}

}
