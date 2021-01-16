package org.cmada;

public class Game {

   private Rescuer rescuer;
   private Animal animal;
   private MedicalStaff medic;

    public org.cmada.Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(org.cmada.Rescuer rescuer) {
        this.rescuer = rescuer;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public MedicalStaff getMedic() {
        return medic;
    }

    public void setMedic(MedicalStaff medic) {
        this.medic = medic;
    }
}
