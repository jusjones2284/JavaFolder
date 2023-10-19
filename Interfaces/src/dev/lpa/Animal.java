package dev.lpa;


class Satellite implements OrbitEarth{

    enum FlightStages implements Trackable{GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

        @Override
        public void track() {
            if(this != GROUNDED){
                System.out.println("Monitoring " + this);
            }
        }
    }
    record DragonFly(String name, String type) implements FlightEnabled{

        @Override
        public void takeOff() {

        }

        @Override
        public void land() {

        }

        @Override
        public void fly() {

        }
    }
    public void achieveOrbit(){
        System.out.println("Orbit achieved!");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();
}

interface FlightEnabled{

    //PUBLIC STATIC AND FINAL INSTANCES SO THEYRE REALLY CONSTANTS
    //constant in JAVA is a variable that cant be changed
    //constant variable is a final variable of primitive type, or type string,
    //that is initalized with a constant expression.
    //Constants in Java, are usually named with all uppercase letters,
    //with underscores between words.
    //a static constant means we access it via the type name.
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    void takeOff();
    void land();
    void fly();

}

interface Trackable{

    void track();
}
public abstract class Animal {

    public abstract void move();
}
