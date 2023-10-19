package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;
        Jet twinTurbo = new Jet();

        animal.move();
//        flier.move();
//        tracked.move();

//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();

        inFlight(flier);
        inFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTravled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck travled %.2f km or %.2f miles%n",
                kmsTraveled, milesTravled
                );

        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled>betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);


    }

    private static void inFlight(FlightEnabled flier){

        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers){

        for(var flier: fliers){
            flier.takeOff();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers){

        for(var flier : fliers){
            flier.land();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers){

        for(var flier : fliers){
            flier.fly();
        }
    }




}