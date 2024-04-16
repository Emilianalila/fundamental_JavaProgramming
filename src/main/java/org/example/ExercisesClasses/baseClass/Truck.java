package org.example.ExercisesClasses.baseClass;

public class Truck extends  Vehicle{
    //
    private int wheels;
    //
    public Truck(String model, String make, int year, String fuel, int wheels) {
        super(model, make, year, fuel);
        this.wheels = wheels;
        System.out.println("I am the constructor of Truck");
    }
    //getter
     public int getWheels(){
        return wheels;
     }
    // if we extend from an "abstract class", we need to implement the methods that the super class have marked as abstract, otherwise we are going to have an error
    @Override
    public int getEfficiency() {
        return 12;
    }

    @Override
    public double getDistanceTravel() {
        return 60;
    }

    @Override
    public double getMaximumSpeed() {
        return 20;
    }
}
