package org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes;

/**
 * Concrete implementation of Square
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Square shape");
    }
}
