package org.example.chapter12_Exercises.baseClass;

public abstract class Vehicle {
    //properties:
    private String model;
    private String make;
    private int year;
    private String fuel;

    //constructor
    public Vehicle (String model, String make, int year, String fuel){
        this.model = model;
        this.make = make;
        this.year = year;
        this.fuel = fuel;
    }
    // getters
    public String getModel(){
        return model;
    }
    public String getMake (){
        return make;
    }
    public int getYear(){
        return year;
    }
    public String getFuel(){
        return fuel;
    }

    //extra methods:
    public abstract int getEfficiency();
    public abstract double getDistanceTravel();
    public abstract double getMaximumSpeed();

    //
    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
