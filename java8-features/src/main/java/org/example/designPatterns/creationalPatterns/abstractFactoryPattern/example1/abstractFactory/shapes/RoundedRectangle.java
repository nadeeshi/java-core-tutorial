package org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes;

/**
 * Concrete implementation of RoundedRectangle
 */
public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw RoundedRectangle shape");
    }
}
