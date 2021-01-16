package org.cmada;

public class AutoVehicle extends Vehicle {

    private Engine engine;
    private double mileage;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
        System.out.println("Custom constructor called");

     }

     public  AutoVehicle(Engine engine, String name){
        this(engine);
        setName(name);
     }

     public AutoVehicle(){
        this(new Engine());
     }


    @Override
    public Engine getEngine() { return engine; }

    public void getEngine(String stringParam){}

    @Override
    public void setEngine(Engine engine) { this.engine = engine; }

    @Override
    public double getMileage() { return mileage; }

    @Override
    public void setMileage(double mileage) { this.mileage = mileage; }
}
