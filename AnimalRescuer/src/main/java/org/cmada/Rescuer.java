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
    }
    public void entertain(Animal animal, EntertainmentActivity activity) {
        System.out.println(this.name + " just did/played some " + activity.getName() + animal.getName());
    }
}
