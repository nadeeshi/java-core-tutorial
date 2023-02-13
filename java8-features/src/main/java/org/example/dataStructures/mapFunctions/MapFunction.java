package org.example.dataStructures.mapFunctions;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class MapFunction {
	private static Map<Integer, Integer> createMap() {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 15);
		map.put(4, 20);
		map.put(5, 30);
		
		return map;
	}
	private int findMinimumValueInMap(Map<Integer, Integer> map) {
		int min = 0;
		
		// using simple comparator(before java 8)
		Entry<Integer, Integer> minimum = null;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
		     if (minimum == null || entry.getValue().compareTo(minimum.getValue()) < 0) {
		         minimum = entry;
		     }
		 
		     min = minimum.getValue();
		 }

		System.out.println("Minimum Key: " + minimum.getKey());
		System.out.println("Minimum Value: " + minimum.getValue());
		
		
		//Using Collections
		int minValueInMap = (Collections.min(map.values()));  
		int minKeyInMap = (Collections.min(map.keySet()));
		
		System.out.println("Minimum Value using Collection: " + minValueInMap);
		System.out.println("Minimum Key using Collection: " + minKeyInMap);
		
		
		//Using Stream
		Optional<Entry<Integer, Integer>> minEntry = map.entrySet()
		        .stream()
		        .min((Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) -> e1.getValue().compareTo(e2.getValue()));
		
		System.out.println("Minimum Value using Stream: " + minEntry.get().getValue());
		System.out.println("Minimum Key using Stream: " + minEntry.get().getKey());
		
		
		// Using Stream + method reference
		Optional<Entry<Integer, Integer>> minEntry2 = map.entrySet()
		        .stream()
		        .min(Comparator.comparing(Entry::getValue));

//		System.out.println("Minimum Value using Stream: " + minEntry2.get().getValue());
		System.out.println("Minimum Value using Stream: " + (minEntry2.map(Entry::getValue).orElse(null)));
		System.out.println("Minimum Key using Stream: " + minEntry2.get().getKey());    
		    
		return min;
	}
	
	private int findMaximumValueInMap(Map<Integer, Integer> map) {
		int max = 0;
		
		// using simple comparator(before java 8)
		Entry<Integer, Integer> maximum = null;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
		
		     if (maximum == null || entry.getValue().compareTo(maximum.getValue()) > 0) {
		    	 maximum = entry;
		     }
		 
		     max = maximum.getValue();
		 }

		System.out.println("Maximum Key: " + maximum.getKey());
		System.out.println("Maximum Value: " + maximum.getValue());
		
		
		//Using Collections
		int maxValueInMap = (Collections.max(map.values()));  
		int maxKeyInMap = (Collections.max(map.keySet()));
		
		System.out.println("Maximum Value using Collection: " + maxValueInMap);
		System.out.println("Maximum Key using Collection: " + maxKeyInMap);
		
		
		//Using Stream
		Optional<Entry<Integer, Integer>> maxEntry = map.entrySet()
		        .stream()
		        .max((Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) -> e1.getValue().compareTo(e2.getValue()));
		
		System.out.println("Maximum Value using Stream: " + maxEntry.get().getValue());
		System.out.println("Maximum Key using Stream: " + maxEntry.get().getKey());
		
		return max;
	}
	
	
	private int removeValueFromMap(Map<Integer, Integer> map) {
		int max = 0;
		
		//Map.Entry<Integer, Integer> newMap = map.entrySet().removeIf(entry -> (entry.getValue() <= 15));
		
		// remove by value
		//map.values().removeIf(value -> !value.contains("1"));
		
		// remove by key
		//map.keySet().removeIf(key -> key != 1);
		
		// remove by entry / combination of key + value
		map.entrySet().removeIf(entry -> (entry.getValue() <= 15));
		
		
		Optional<Entry<Integer, Integer>> minEntry = map.entrySet()
		        .stream()
		        .min((Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) -> e1.getValue().compareTo(e2.getValue()));
		
		System.out.println("Minimum Value using Stream: " + minEntry.get().getValue());
		System.out.println("Minimum Key using Stream: " + minEntry.get().getKey());
		
		
		//map.values().removeAll(Collections.singleton("0"));
		
		
		return max;
	}

	public static void main(String[] args) {
		MapFunction mapFunction = new MapFunction();
		Map<Integer, Integer> map = createMap();
		mapFunction.findMinimumValueInMap(map);
		mapFunction.findMaximumValueInMap(map);
		mapFunction.removeValueFromMap(map);
	}

}
