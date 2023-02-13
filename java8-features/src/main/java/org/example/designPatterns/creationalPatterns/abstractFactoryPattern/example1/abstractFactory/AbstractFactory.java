package org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory;

import org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes.Shape;
import org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory.shapes.ShapeType;

/**
 * Abstract class for creating families of shape objects(Normal and Rounded)
 *
 * AbstractFactory class work as a super factory that creates other sub-factories. So, this factory is called as a Factory of factories.
 * Basically, This AbstractFactory provides an interface for creating families of related or dependent objects without specifying their concrete classes.
 */
public abstract class AbstractFactory {

    abstract Shape getShape(ShapeType shapeType);
}
