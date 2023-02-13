package org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes;

/**
 * Concrete implementation of RoundedSquare
 */
public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw RoundedSquare shape");
    }
}
