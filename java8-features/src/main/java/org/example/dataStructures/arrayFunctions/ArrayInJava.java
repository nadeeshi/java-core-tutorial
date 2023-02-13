package org.example.dataStructures.arrayFunctions;

/**
 * Java arrays can create using both Primitive types and Wrapper types
 */
public class ArrayInJava {

    private void createArray() {
        Integer[] array = new Integer[3]; // can create using wrapper object

        int[] ar = new int[3]; // can create using primitive objects


        // Both will create an int array with a length of 5.
        int[] myArray = new int[5];
        int myArray1[] = new int[5];

        // declaring and initializing an array
        int[] myArray2 = { 2, 3, 4, 5, 6 };
    }

    public static void main (String[] args) {
        // declaring and initializing an array
        String strArray[] = {"Python", "Java", "C++", "C", "PHP"};

        // using a for-each loop for printing the array
        for(String i : strArray) {
            System.out.print(i + " ");
        }

        // find the length of an array
        System.out.println("\nLength of array: "+strArray.length);


        // using for loop
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
