package org.example.chapter9_Inheritance.CakeExercise;

public class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake(){
        super("Vanilla");
    }

    public void setTiers(int tiers){
        this.tiers = tiers;
    }
    public int getTiers(){
        return tiers;
    }

}
