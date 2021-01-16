package org.cmada;

public abstract class EntertainmentActivity {

    private final String eating;

    public EntertainmentActivity(String eating) {
        this.eating = eating;
    }

    public abstract String getName();

}
