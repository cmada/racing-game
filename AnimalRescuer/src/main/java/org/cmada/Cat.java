package org.cmada;

import com.sun.media.sound.SoftMidiAudioFileReader;

public class Cat extends Animal {

    private int legsCount;
    private String name;

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void expressJoy(){
        System.out.println(getName() + " is meowing happily.");
    }

    public int getLegsCount(){
        return legsCount;
    }
}
