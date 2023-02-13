package org.example.designPatterns.structuralPatterns.decoratorPattern.example1.decorator;

/**
 * Implement Luxury behavior by extending the base CarDecorator
 */
public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Luxury features");
    }
}
