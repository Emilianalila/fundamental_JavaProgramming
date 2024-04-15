package org.example.chapter12_Exercises.baseClass;

public class Motorcycle  extends Vehicle{
    //
    private String color;

    //
    public Motorcycle(String make, String model, int year, String fuel, String color){
        super(model, make, year, fuel);
        this.color = color;
    }
    //getter:
    public String getColor(){
        return color;
    }
    //
    @Override
    public int getEfficiency() {
        return 10;
    }

    @Override
    public double getDistanceTravel() {
        return 100;
    }

    @Override
    public double getMaximumSpeed() {
        return 40;
    }
}
