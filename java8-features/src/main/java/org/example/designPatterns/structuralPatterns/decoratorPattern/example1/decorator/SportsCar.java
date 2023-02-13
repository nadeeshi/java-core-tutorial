package org.example.designPatterns.structuralPatterns.decoratorPattern.example1.decorator;

/**
 * Implement Sports behavior by extending the base CarDecorator
 */
public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding sports features");
    }
}
