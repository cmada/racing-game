package org.cmada;

public class RadioControlledCar extends AutoVehicle {

    private int doorCount;

    public RadioControlledCar(Engine engine) {
        super(engine);
    }

    public RadioControlledCar() {
        super();
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
