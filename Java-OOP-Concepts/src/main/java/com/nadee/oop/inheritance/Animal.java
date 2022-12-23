package main.java.com.nadee.oop.inheritance;

/*
 * In OOP, the idea of inheritance provides the concept of reusability.
 * It means that we can add additional features to parent class without modification; this is possible by deriving a new class from the parent class. 
 */
public class Animal {
	
	void eat() {
		System.out.println("I am omnivorous");
	}

}


class Mammal extends Animal {

	void nature() {
		System.out.println("I am Mammal");
	}
}

class Dog extends Mammal {
	
	void sound() {
		System.out.println("I can bark");
	}
}