package org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory;


import org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes.Shape;
import org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes.ShapeType;

public class AbstractFactoryPattern {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(ShapeType.SQUARE);
        shape2.draw();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        Shape shape3 = roundedShapeFactory.getShape(ShapeType.ROUNDED_RECTANGLE);
        shape3.draw();

        Shape shape4 = roundedShapeFactory.getShape(ShapeType.ROUNDED_SQUARE);
        shape4.draw();
    }
}
