package org.example.OOP.encapsulation.example1;

/**
 * The wrapping up(black-box) of the data and methods into the single unit is known as encapsulation.
 * The data is accessible only to those methods, which are wrapped in the class, and not to the outside world.
 * Encapsulation of the object makes it possible for the objects to be treated like ‘black boxes’ that perform a specific task without
 * any concern for internal implementation.
 *
 * Abstraction is the concept of hiding the internal details and describing things in simple terms.
 * There are many ways to achieve abstraction in object-oriented programmings, such as encapsulation and inheritance.
 */
public class CarApp {

    public static void main(String[] args) {
        Car carObj = new Tesla();
        carObj.drive();
        carObj.gearChange();

        // object from abstract class can't be instantiated with new operator
        //Car abstractOnj = new Car();
    }
}
