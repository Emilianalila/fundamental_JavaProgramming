package org.example.chapter12_Exercises.baseClass;

public class Truck extends  Vehicle{
    //
    private int wheels;
    //
    public Truck(String model, String make, int year, String fuel, int wheels) {
        super(model, make, year, fuel);
        this.wheels = wheels;
        System.out.println("I am the constructor of Truck");
    }
    //
     public void setWheels( int wheels){
        this.wheels = wheels;
     }
     public int getWheels(){
        return wheels;
     }

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
