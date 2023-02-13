package org.example.OOP.polymorphism.example1;

/**
 * In polymorphism, objects having different internal structures can share the same external interface;
 * it means that a class of operation may be accessed in the same manner even though actions with each operation may differ.
 * Inheritance extensively uses the concept of polymorphism.
 *
 * Method Overloading
 * It is possible to create methods with the same name but different parameter lists and different definitions.
 * Method overloading is required when objects are required to perform similar tasks but using different input parameters.
 *
 */
public class CircleArea {

    double area(double x) {
        return 3.14 * x;
    }
}

class SquareArea {
    int area(int x) {
        return x * x;
    }
}

class RectangleArea {
    int area(int x, int y) {
        return x * y;
    }
}

class TriangleArea {
    int area(int x, int y) {
        return (x * y) / 2;
    }
}