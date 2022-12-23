package main.java.com.nadee.oop.polymorphism;

/*
 * Overriding is achieved by defining a method in the subclass that has the same name, the same arguments, and the same return type as a method in the superclass. 
 * So, when the method is called, the method defined in the subclass invoked and executed instead of the one in the superclass. 
 */
public class Shape {
	void draw() {
		System.out.println("Mention shape here");
	}

	void numberOfSides() {
		System.out.println("Sides = 0");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Circle");
	}

	void numberOfSides() {
		System.out.println("Sides = 0");
	}
}

class Box extends Shape {
	void draw() {
		System.out.println("Box");
	}

	void numberOfSides() {
		System.out.println("Sides = 6");
	}
}

class Traingle extends Shape {
	void draw() {
		System.out.println("Traingle");
	}

	void numberOfSides() {
		System.out.println("Sides = 3");
	}
}

