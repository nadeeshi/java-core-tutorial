package main.java.com.nadee.oop.polymorphism;

/*
 * Polymorphism is an important OOP concept; it means the ability to take many forms
 * Polymorphism can be achieved in two ways: Method Overloading, Method Overriding
 */
public class Overloading {

	public static void main(String[] args) {
		CircleArea ca = new CircleArea();
		SquareArea sa = new SquareArea();
		RectangleArea ra = new RectangleArea();
		TriangleArea ta = new TriangleArea();

		System.out.println("Circle area = " + ca.area(1));
		System.out.println("Square area = " + sa.area(2));
		System.out.println("Rectangle area = " + ra.area(3, 4));
		System.out.println("Triangle area = " + ta.area(6, 3));
	}

}
