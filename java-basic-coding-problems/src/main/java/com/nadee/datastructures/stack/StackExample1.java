package main.java.com.nadee.datastructures.stack;

import java.util.Stack;
/**
 * Stack is a linear data structure that used to store the collections of objects
 * based on Last-In-First-Out
 * Provide different operations such as push, pop, search
 * 
 * @author Nadee
 *
 */
public class StackExample1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>(); // creating an instance of Stack class
		
		boolean result = stack.empty(); // checking stack is empty or not
		System.out.println("Is the stack empty? " + result);
		
		// the method pushes/insert an element onto the top of the stack
		stack.push(50); // pushing elements into stack
		stack.push(40);
		stack.push(60);
		stack.push(100);
		
		// print elements of the stack
		System.out.println("Element in Stack " + stack);
		result = stack.empty();
		System.out.println("is the Stack empty? " + result);
		
		// the method removes an element from the top of the stack and returns the same element
		int popElement = stack.pop();
		System.out.println("Pop element: " + popElement);
		System.out.println("Element in Stack after one pop call " + stack);
		
		// the method looks at the top element of the stack without removing it
		int peekElement = stack.peek();
		System.out.println("Peek element: " + peekElement);
		System.out.println("Element in Stack after one peek call " + stack);
	
		// the method searches the specified object and return the position of the object
		int searchElement = stack.search(40);
		System.out.println("Search element: " + searchElement);
		System.out.println("Element in Stack after one search call " + stack);
	}

}
