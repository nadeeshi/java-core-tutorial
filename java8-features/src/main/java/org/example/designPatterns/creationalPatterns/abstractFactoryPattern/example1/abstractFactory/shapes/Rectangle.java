package org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes;

/**
 * Concrete implementation of Rectangle
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Rectangle shape");
    }
}
