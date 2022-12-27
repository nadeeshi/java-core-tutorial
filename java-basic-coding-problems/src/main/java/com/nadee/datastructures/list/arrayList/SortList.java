package main.java.com.nadee.datastructures.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		
		Collections.sort(list1);
		
		for(String fruit: list1) {
			System.out.println(fruit);
		}
		
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(34);
		list2.add(67);
		list2.add(23);
		list2.add(12);
		
		Collections.sort(list2);
		
		for(Integer number: list2) {
			System.out.println(number);
		}
	}

}
