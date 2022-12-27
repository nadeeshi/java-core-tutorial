package main.java.com.nadee.datastructures.map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class ComparingByKey {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");

		/*
		 * map.entrySet() - returns a Set view of the mappings contained in this map
		 * stream() - returns a sequential Stream with this collection as its source
		 * sorted(Map.Entry.comparingByKey()) - Sorted according to the provided Comparator
		 * forEach - performs an action for each element of this stream
		 */
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}

}
