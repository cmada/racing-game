package org.cmada;

public class Race {

    private Vehicle firstCompetitor;
    private Vehicle secondCompetitor;

    public Race(Vehicle firstCar, Vehicle secondCar) {
        this.firstCompetitor = firstCar;
        this.secondCompetitor = secondCar;
    }

    public Vehicle getFirstCompetitor() {
        return firstCompetitor;
    }

    public Vehicle getSecondCompetitor() {
        return secondCompetitor;
    }
}
