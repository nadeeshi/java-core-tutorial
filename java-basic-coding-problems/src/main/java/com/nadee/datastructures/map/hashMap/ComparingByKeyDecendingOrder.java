package main.java.com.nadee.datastructures.map.hashMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ComparingByKeyDecendingOrder {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");

		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);

	}

}
