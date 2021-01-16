package org.cmada;

public class AutoVehicle extends Vehicle {

    private Engine engine;
    private double mileage;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
        System.out.println("Custom constructor called");

     }


    public AutoVehicle() {

    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public double getMileage() {
        return mileage;
    }

    @Override
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
