package main.java.com.nadee.datastructures.map.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * A map contains values on the basis of Key and Value pair.
 * Each key and value pair is known as an entry
 * A map contains unique keys
 * A Map is useful if you have to search, update or delete elements on the basis of a key
 * 
 * @author Nadee
 *
 */
public class NonGenericMap {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put(1, "Nadee");
		map.put(5, "Rahul");
		map.put(2, "Jalu");
		map.put(6, "Amila");
		
		//Traversing Map
		Set set = map.entrySet();
		Iterator itr = set.iterator(); // Converting to Set, that we can traverse
		
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
