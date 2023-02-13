package org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory;


import org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes.RoundedRectangle;
import org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes.RoundedSquare;
import org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes.Shape;
import org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes.ShapeType;

/**
 * Implementation of RoundedShapeFactory using AbstractFactory
 * to generate object of concrete class
 */
public class RoundedShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case ROUNDED_RECTANGLE:
                return new RoundedRectangle();
            case ROUNDED_SQUARE:
                return new RoundedSquare();
            default:
                throw new IllegalArgumentException("Unknown rounded shape type");
        }
    }
}
