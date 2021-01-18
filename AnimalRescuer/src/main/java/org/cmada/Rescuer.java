package org.cmada;

class Rescuer extends Mamifer {
    
   private double money;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void feed(Animal animal, Food food) {
        System.out.println(this.name + " just gave some " + food.getName() + " food to " +animal.getName());

        double hungerLevel = animal.getHungerLevel();
        hungerLevel--;
        animal.setHungerLevel(hungerLevel);

        System.out.println(animal.getName() + "'s hunger level is now: " + animal.getHungerLevel());

        if (food.getName().equals(animal.getFavoriteFoodName())){
            animal.setHealthLevel(animal.getHealthLevel() + 1);
            System.out.println(animal.getName() + "s happiness level is now " + animal.getHealthLevel());
        }

    }
    public void entertain(Animal animal, EntertainmentActivity activity) {
        System.out.println(this.name + " just did/played some " + activity.getName() + animal.getName());

        int increment;

        if (activity.getName().equals(animal.getFavoriteActivityName())){

            increment = 2;
        } else {

            increment =1;
        }

        animal.setHealthLevel(animal.getHealthLevel()+ increment);

        System.out.println(animal.getName() + "'s health level is now: " + animal.getHealthLevel());
    }
}
