package org.example.designPatterns.structuralPatterns.decoratorPattern.example1.decorator;

/**
 * Implement a Basic car by implementing Car interface
 */
public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Basic car is created");
    }
}
