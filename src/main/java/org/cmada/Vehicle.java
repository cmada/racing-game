package org.cmada;

public abstract class Vehicle {

    public static final String CONTROL_TYPE = "Radio Control";
    private String name;
    private String color;
    private int wheelCount;
    private double currentSpeed;

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    protected double accelerate (double speed) {
       currentSpeed += speed;

        return currentSpeed / 60;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name.trim(); }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", wheelCount=" + wheelCount +
                '}';
    }

    public abstract Engine getEngine();

    public abstract void setEngine(Engine engine);

    public abstract double getMileage();

    public abstract void setMileage(double mileage);
}



