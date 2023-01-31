package org.example.dataStructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetVsHashMap {

	private static void createSet() {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(null);
		set.add(2);
		set.add(null);
		
		set
		.forEach(System.out::println);
	}
	
	private static void createHashMap() {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Nadee");
		map.put(2, "Kamal");
		map.put(1, "Nimal");
		map.put(3, null);
		map.put(3, null);
		map.put(4, null);
		
		map.entrySet()
		.forEach(System.out::println);
		
//		map.entrySet().removeIf(entry -> entry.getKey() != 1);
//		
//		Map.Entry<Integer, Integer> newMap = priceMap.entrySet().removeIf(entry -> (entry.getKey() <= buyDay));
//		
//		priceMap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
//		
//		 return maximum != null? maximum.getKey() : 0;
	}
	
	
//	 Entry<Integer, Integer> minimum = null;
//     for (Map.Entry<Integer, Integer> entry : priceMap.entrySet()) {
//
//         if (minimum == null || entry.getValue().compareTo(minimum.getValue()) < 0) {
//             minimum = entry;
//         }
//     
//         return minimum.getKey();
//     }
	
	public static void main(String[] args) {
		createSet();
		createHashMap();
	}

}
