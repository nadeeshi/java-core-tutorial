package main.java.com.nadee.datastructures.array;

/**
 * Every array has an associated Class object
 * Arrays are objects of a class, and a direct super class of arrays is a class object
 * 
 * @author Nadee
 *
 */
public class ClassObjectsForArrays {

	public static void main(String[] args) {
		int intArray[] = new int[3];
		byte byteArray[] = new byte[3];
		short shortArray[] = new short[3];
		String[] strArray = new String[3];
		
		System.out.println("Class of Integer array : " + intArray.getClass());
		System.out.println("Super Class of Integer array : " + intArray.getClass().getSuperclass());
		System.out.println("Class of Byte array : " + byteArray.getClass());
		System.out.println("Class of Short array : " + shortArray.getClass());
		System.out.println("Class of String array : " + strArray.getClass());
		System.out.println("Super Class of String array : " + strArray.getClass().getSuperclass());

	}

}
