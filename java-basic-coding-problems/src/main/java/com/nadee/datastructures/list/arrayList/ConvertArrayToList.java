package main.java.com.nadee.datastructures.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {
		String[] array = { "Python", "PHP", "Java" };
		System.out.println("Printing Array : " + Arrays.toString(array));

		List<String> list = new ArrayList<String>();
		for (String lang : array) {
			list.add(lang);
		}

		System.out.println("Printing List: " + list);
	}

}
