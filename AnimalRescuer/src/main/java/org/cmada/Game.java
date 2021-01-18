package org.cmada;

import java.util.ArrayList;
import java.util.List;

public class Game {

   private Rescuer rescuer;
   private Animal animal;
   private MedicalStaff medic;
   private List<Food> availableFood = new ArrayList<>();
   private EntertainmentActivity[] availableActivities = new EntertainmentActivity[5];

   private void initFood(){
        Food dogFood = new Food("Ceafa");
        Food catFood = new Food("Purina");
        availableFood.add(dogFood);
        availableFood.add(catFood);
   }

   private void initActivities(){

       EntertainmentActivity activity1 = new EntertainmentActivity("Running") {
           @Override
           public String getName() {
               return null;
           }
       };

       EntertainmentActivity activity2 = new EntertainmentActivity("Swimming") {
           @Override
           public String getName() {
               return null;
           }
       };

       availableActivities[0] = activity1;
       availableActivities[1] = activity2;

   }

   public void start() {
       initFood();
       initActivities();


       displayAvailableFood();
       displayAvailableActivities();

   }

   private void displayAvailableFood(){
       System.out.println("Available food: ");
       for (Food food: availableFood){
           if (food !=null){
               System.out.println(food.getName());
           }
       }

   }


   private void displayAvailableActivities(){
       System.out.println("Available activities: ");
       for (int i = 0; i < availableActivities.length; i++){
           if (availableActivities[i] !=null){
               System.out.println(availableActivities[i].getName());
           }
       }
   }
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
