package org.cmada;

public class Dog extends Mamifer {

    private double barkPower;
    private String name;

    public void setBarkPower(double barkPower) {
        this.barkPower = barkPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void expressJoy(){
        System.out.println(getName() + "'s tail is wagging.");
    }

    public double getBarkPower(){
        return barkPower;
    }
}
