package main.java.com.nadee.datastructures.array;

/**
 * An array of objects is created like same as an array of primitive type items
 * 
 * @author Nadee
 *
 */
public class ArraysOfObjects {

	public static void main(String[] args) {
		// declare array and allocate memory for 5 objects of type Student
		Student[] arr = new Student[5];
		arr[0] = new Student(1, "nadee");
		arr[1] = new Student(2, "test");
		arr[2] = new Student(3, "tree");
		arr[3] = new Student(4, "test2");
		arr[4] = new Student(5, "jackson");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at " + i + " : " + arr[i].id + " " + arr[i].name);
		}
	}
}


class Student {
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}	
}

