package main.java.com.nadee.datastructures.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap is just like HashMap with an additional feature of maintaining an order of elements inserted into it.
 * 
 * HashMap provided the advantage of quick insertion, search, and deletion but it never maintained the track and order of insertion
 * which the LinkedHashMap provides where the elements can be accessed in their insertion order.
 * 
 * 
 * @author Nadee
 *
 */
public class LinkedHashMapExample1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();

		map.put("Nadee", 100);
		map.put("Nipun", 400);
		map.put("Sandir", 300);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
