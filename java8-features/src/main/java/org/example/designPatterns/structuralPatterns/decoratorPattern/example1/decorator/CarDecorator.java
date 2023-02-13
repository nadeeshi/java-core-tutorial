package org.example.designPatterns.structuralPatterns.decoratorPattern.example1.decorator;

/**
 *  This class implements the Car interface, and it has a HAS-A relationship with the car interface.
 */
public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
