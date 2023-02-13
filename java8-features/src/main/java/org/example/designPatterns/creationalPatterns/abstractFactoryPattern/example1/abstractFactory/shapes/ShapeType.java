package org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes;

/**
 * Define enum classes for different shapes
 */
public enum ShapeType {
    RECTANGLE("Rectangle"), SQUARE("Square"), ROUNDED_RECTANGLE("RoundedRectangle"), ROUNDED_SQUARE("RoundedSquare");

    private String shape;

    ShapeType(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }
}
