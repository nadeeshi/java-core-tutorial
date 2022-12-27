package main.java.com.nadee.datastructures.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {
		List<String> fruitList = new ArrayList<>();
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Manago");
		
		String[] array = fruitList.toArray(new String[fruitList.size()]);
		
		System.out.println("Printing Array: " + Arrays.toString(array));
		
		System.out.println("Printing List: " + fruitList);

	}

}
