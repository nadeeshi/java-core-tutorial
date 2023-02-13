package org.example.OOP.abstraction.example1;

public class AutomaticCar implements Car {

    private String carType = "Automatic";

    @Override
    public void turnOnCar() {
        System.out.println("turn on the automatic car");
    }

    @Override
    public void turnOffCar() {
        System.out.println("turn off the automatic car");
    }

    @Override
    public String getCarType() {
        return this.carType;
    }
}
