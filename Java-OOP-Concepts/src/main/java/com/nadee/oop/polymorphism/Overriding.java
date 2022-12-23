package main.java.com.nadee.oop.polymorphism;

/*
 * A method defined in the superclass is inherited by its subclass and is used by the objects created by the subclass.
 * 
 */
public class Overriding {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		c.numberOfSides();

		Box b = new Box();
		b.draw();
		b.numberOfSides();

		Traingle t = new Traingle();
		t.draw();
		t.numberOfSides();
	}

}
