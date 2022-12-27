package main.java.com.nadee.datastructures.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class GetSetElementInList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Orange");
		
		System.out.println("Initial List: " + list);
		
		// accessing the element
		System.out.println("Returning element: " + list.get(1));
		
		// changing/replace the element
		list.set(1, "Coconut");
		
		for(String fruit: list) {
			System.out.println(fruit);
		}
	}

}
