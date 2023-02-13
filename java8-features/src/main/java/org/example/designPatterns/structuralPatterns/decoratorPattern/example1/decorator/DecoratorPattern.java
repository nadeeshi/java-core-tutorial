package org.example.designPatterns.structuralPatterns.decoratorPattern.example1.decorator;

public class DecoratorPattern {

    public static void main(String[] args) {
        System.out.println("Step for create Sports car:- ");
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println("\n");

        System.out.println("Step for create Sports Luxury car:- ");
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
