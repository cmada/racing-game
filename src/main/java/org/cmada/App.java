package org.cmada;

public class App<car> {
    public static void main(String[] args) {


        Engine daciaEngine = new Engine();
        daciaEngine.setManufacturer("Renault");

        RadioControlledCar dacia = new RadioControlledCar(daciaEngine);
        dacia.setName("Dacia");
        dacia.setColor("red");
        dacia.setDoorCount(4);
        dacia.setWheelCount(4);
        dacia.setMileage(8.5);

        Engine ladaEngine = new Engine();
        ladaEngine.setManufacturer("Lada");

        RadioControlledCar lada = new RadioControlledCar(ladaEngine);

        lada.setName("lada");
        lada.setColor("blue");
        lada.setDoorCount(2);
        lada.setWheelCount(4);
        lada.setMileage(8);

        RadioControlledMotorcycle motorcycle = new RadioControlledMotorcycle(new Engine());
        motorcycle.accelerate(10);

        dacia.setName("Dacia Logan");

        new AutoVehicle(new Engine(), "name autovehicle");

        System.out.println(dacia.toString());

        Race race = new Race();

        race.getCompetitors().add(dacia);
        race.getCompetitors().add(lada);

        for (Vehicle vehicle : race.getCompetitors()) {

            if (vehicle !=null){
                System.out.println(vehicle.getName());
            }


        }


    }
}


