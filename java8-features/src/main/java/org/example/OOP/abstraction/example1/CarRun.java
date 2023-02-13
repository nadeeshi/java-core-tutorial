package org.example.OOP.abstraction.example1;
/**
 * Abstraction is the concept of hiding the internal details and describing things in simple terms.
 * The internal processing of the method is hidden from the outer world.
 * It’s used to create a boundary between the application and the client programs.
 *
 * An object contains some properties and methods.
 * We can hide them from the outer world through access modifiers.
 * We can provide access only for required functions and properties to the other programs.
 *
 * Two types of abstraction :- Data Abstraction, Process Abstraction
 *
 * The client program only knows about the Car and the functions that the Car provides.
 * The internal implementation details are hidden from the client program.
 **/
public class CarRun {

    public static void main(String[] args) {
        Car car1 = new ManualCar();
        Car car2 = new AutomaticCar();

        car1.turnOnCar();
        car1.turnOffCar();
        System.out.println(car1.getCarType());

        car2.turnOnCar();
        car2.turnOffCar();
        System.out.println(car2.getCarType());

    }
}
