package main.java.com.nadee.datastructures.stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

/**
 * Iterate means to fetch the elements of the Stack
 * We can fetch elements of the Stack using 3 different methods as follows
 * 	1. using iterator()
 * 	2. using forEach()
 * 	3. using listIterator()
 * 
 * @author Nadee
 *
 */
public class StackIterator {

	public static void main(String[] args) {
		Stack stack = new Stack(); // creating an object of Stack class

		stack.push("Ferrari");
		stack.push("Audi");
		stack.push("BMW");
		stack.push("Bugatti");
		stack.push("Jaguar");

		System.out.println("Iteration over the Stack using iterator() method : ");
		// iterator() is the method of the iterator interface
		// it returns an iterator over the elements in the Stack
		Iterator iterator = stack.iterator();
		while (iterator.hasNext()) {
			Object values = iterator.next();
			System.out.println(values);
		}

		System.out.println("Iteration over the Stack using forEach() method : ");
		// this method is defined the Iterable and Stream interface
		stack.forEach(n -> {
			System.out.println(n);
		});

		System.out.println("Iteration over the Stack using listIterator() method : ");
		// creating an instance of Stack class
		Stack<Integer> stk = new Stack<>();
		stk.push(100);
		stk.push(200);
		stk.push(500);
		ListIterator<Integer> listIterator = stk.listIterator(stk.size());
		
		// it iterates the stack from top to bottom
		while (listIterator.hasPrevious()) {
			Integer avg = listIterator.previous();
			System.out.println(avg);
		}
	}

}
