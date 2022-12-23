package main.java.com.nadee.strings;

import java.util.HashSet;

public class PangramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given String    
	      String inputString = "Do you know how many total keywords present in Java";
	      
	      /* Convert inputString to lowercase and remove all whitespaces by using replaceAll() method */
	      inputString = inputString.toLowerCase().replaceAll(" ","");
	      
	      // Convert inputString to char array 
	      char[] arr = inputString.toCharArray();
	      
	      // Initialize HashSet
	      // HashSet contains only unique elements, no duplicate entries are allowed
	      HashSet<Character> set = new HashSet<>();
	      
	      // Iterating char array 
	      for(char ch : arr)
	      {
	          set.add(ch);
	      }
	      
	      // If set size is 26 then inputString is Pangram otherwise not
	      if(set.size() == 26)
	        System.out.println("Input String is Pangram");
	      else
	        System.out.println("Input String is NOT Pangram");

	}

}
