package main.java.com.nadee.datastructures.map.treeMap;

import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap in Java is used to implement the Map interface and NavigableMap along with the Abstract class.
 * 
 * The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time
 * 
 * @author Nadee
 *
 */
public class TreeMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();

		map.put("Vaibha", 100);
		map.put("Sachin", 300);
		map.put("Veeshal", 200);

		for (Map.Entry<String, Integer> entry : map.entrySet())
			System.out.println(entry.getKey() + " " + entry.getValue());

	}

}
