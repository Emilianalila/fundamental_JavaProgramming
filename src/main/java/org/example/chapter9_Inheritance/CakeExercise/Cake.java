package org.example.chapter9_Inheritance.CakeExercise;

public class Cake {
    //fields
    private String flavor;
    private double price;

    //constructor
    public Cake (String flavor){
        this.flavor = flavor;
    }

    //getters and setters
    public void setFlavor(String flavor){
        this.flavor = flavor;
    }
    public String getFlavor(){
        return flavor;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

}
