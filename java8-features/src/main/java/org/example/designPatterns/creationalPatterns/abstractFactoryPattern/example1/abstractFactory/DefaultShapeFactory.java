package org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory;


import org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes.Rectangle;
import org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes.Shape;
import org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes.ShapeType;
import org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes.Square;

/**
 * Implementation of defaultShapeFactory using AbstractFactory
 * to generate object of concrete class
 */
public class DefaultShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                throw new IllegalArgumentException("Unknown shape type");
        }
    }
}
