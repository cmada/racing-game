package org.cmada;

public class Game {

    public Rescuer rescuer;
    Animal animal;
    MedicalStaff medic;

    public org.cmada.Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(org.cmada.Rescuer rescuer) {
        this.rescuer = rescuer;
    }
}
