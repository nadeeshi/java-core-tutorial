package main.java.com.nadee.datastructures.list.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("Nadee");
		a1.add("Saman");
		a1.add("Kumara");
		a1.add(1, "Sachin");

		ListIterator<String> listIterator = a1.listIterator();
		
		System.out.println("Traversing elements in forward direction ");
		while(listIterator.hasNext()) {
			System.out.println("index: " + listIterator.nextIndex() + " value: " + listIterator.next());
		}
		
		System.out.println("Traversing elements in backward direction ");
		while(listIterator.hasPrevious()) {
			System.out.println("index: " + listIterator.previousIndex() + " value: " + listIterator.previous());
		}
		
	}

}
