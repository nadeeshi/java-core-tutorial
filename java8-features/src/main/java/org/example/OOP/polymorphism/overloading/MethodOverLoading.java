package org.example.OOP.polymorphism.overloading;

/**
 * OOP - Polymorphism -> method overloading(same method name but different parameter list, method signature will be different)
 * @author Nadee
 *
 */
public class MethodOverLoading {

	private void printMsg(String input) {
		System.out.println("String " + input);
	}
	
	private void printMsg(Integer input) {
		System.out.println("Integer " + input);
	}
	
	public static void main(String[] args) {
		MethodOverLoading test = new MethodOverLoading();
		test.printMsg("Nadee");
		test.printMsg(35);
		//test.printMsg(null); compile error, because both String and Integer are non-primitive data types, so they are accepting null values,
		                      // so compiler can't find which method is responsible for this
        test.printMsg((Integer)null);
	}

}
