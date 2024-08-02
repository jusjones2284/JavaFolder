package car.example.constructor.injection.Specification;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details: " + specification.toString());
    }
}
