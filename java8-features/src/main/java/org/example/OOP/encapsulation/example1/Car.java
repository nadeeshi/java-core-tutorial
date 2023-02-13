package org.example.OOP.encapsulation.example1;

/**
 * Abstract class contain abstract keywords
 * An abstract class may not have all the methods are abstract, some are may concrete
 * Abstraction is the act of reducing programming complexity by representing essential features without including the background explanations or details.
 */
public abstract class Car {

    Car() {
        System.out.println("Car is build");
    }

    //abstract method, which has not method body
    abstract void drive();

    //concrete method
    void gearChange() {
        System.out.println("Gear Changed");
    }
}


class Tesla extends Car {

    //override abstract method
    @Override
    void drive() {
        System.out.println("Drive safely");
    }
}