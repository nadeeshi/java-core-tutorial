package main.java.com.nadee.datastructures.map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class ComparingByValue {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");

		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

	}

}
