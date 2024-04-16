package org.example.ExercisesClasses.baseClass;

public class Car extends Vehicle{
    //constructor:
    public Car(String make, String model, int year, String fuel){
        super(make, model, year, fuel);
    }
    //
    @Override
    public int getEfficiency() {
        return 11;
    }

    @Override
    public double getDistanceTravel() {
        return 200;
    }

    @Override
    public double getMaximumSpeed() {
        return 50;
    }
}
