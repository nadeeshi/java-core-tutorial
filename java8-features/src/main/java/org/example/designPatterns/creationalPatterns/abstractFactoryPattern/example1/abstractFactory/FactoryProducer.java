package org.example.designPatterns.creationalPatterns.abstractFactoryPattern.example1.abstractFactory;

/**
 * Provide required Factory implementation according to the requirement
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(boolean isRounded) {
        return isRounded ? new RoundedShapeFactory() : new DefaultShapeFactory();
    }
}
