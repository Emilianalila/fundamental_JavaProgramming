package org.example.exercisesClasses.baseClass;

public class TestingVehicle {
    public static void main(String[] args) {
        // the only class that we can't instantiate is the base class, because is "abstract"!! we can only instantiate its subclasses.
        Truck truck1 = new Truck("Jetta","Ford",94, "gasoline" , 4);
        System.out.println("truck1 = " + truck1);
        System.out.println("truck1 = " + truck1.getFuel());
        System.out.println("truck1 = " + truck1.getWheels());

        Car car1 = new Car("Ford", "px", 2020, "diesel");
        System.out.println("car1 = " + car1);
        System.out.println("car1 = " + car1.getModel());

        Motorcycle motorcycle1 = new Motorcycle("ford", "thai", 2018, "gasoline", "red");
        System.out.println("motorcycle1 = " + motorcycle1);
        System.out.println("motorcycle1 Color= " + motorcycle1.getColor());
        System.out.println("motorcycle1 Maximum speed= " + motorcycle1.getMaximumSpeed());
    }
}
