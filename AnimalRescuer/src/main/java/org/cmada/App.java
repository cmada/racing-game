package org.cmada;

import java.time.LocalDateTime;

public class App
{
    public static void main(String[] args) {
        Rescuer rescuer = new Rescuer();
        rescuer.name = "John";
        rescuer.setMoney(300);

        Animal animal = new Animal();

        animal.setName("Thor");
        animal.setAge(3.5);
        animal.setHealthLevel(10);
        animal.setHungerLevel(5);
        animal.setFavoriteActivityName("Eating");
        animal.setFavoriteFoodName("Ceafa");


        EntertainmentActivity activity = new EntertainmentActivity("Eating") {
            @Override
            public String getName() {
                return null;
            }
        };

        Food food = new Food("Ceafa");
        food.setQuantity(9);
        food.setPrice(55.55);
        food.setInStock(false);
        food.setExpiryDate(LocalDateTime.of(2018, 12, 31, 12,0,0));

        MedicalStaff medic = new MedicalStaff();
        medic.name = "Dr.Vet";
        medic.setSpecialization("Veterinary Medicine");

        Game game = new Game();
        game.setRescuer(rescuer);
        game.setAnimal(animal);
        game.setMedic(medic);

        rescuer.feed(animal, food);
        rescuer.entertain(animal,activity);

        animal.expressJoy();

        Animal dog = new Dog();
        dog.setName("Bruno");
        dog.expressJoy();

        Animal cat = new Cat();
        cat.setName("Filip");
        cat.expressJoy();







        


    }
}
