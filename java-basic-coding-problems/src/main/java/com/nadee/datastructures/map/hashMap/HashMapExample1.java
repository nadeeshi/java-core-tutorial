package main.java.com.nadee.datastructures.map.hashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap is a part of Java Collection
 * It stores the data in (Key, Value) pairs, this class uses a technique called Hashing
 * 
 * Hashing is a technique of converting a large String to a small String that represents the same String
 * A shorter value helps in indexing and faster searches 
 * 
 * A Map cannot contain duplicate keys and each key can map to at most one value.
 * HashMap allow Null key and null values.
 * 
 * 
 * 
 * @author Nadee
 *
 */
public class HashMapExample1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); // creating an empty HashMap

		// Inserting entries to the Map
		map.put("Nadee", 100);
		map.put("Saman", 200);
		map.put("Sachin", 300);

		// Iterating over Map
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue()); // print key-value pairs
		}
	}

}
