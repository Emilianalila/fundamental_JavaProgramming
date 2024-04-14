package org.example.chapter12_Exercises.inheritance;

public class BankAccount {
    private double amount;
    //

    //
    public void setAmount(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
    //extra methods:
    public void deposit(double amount){
        this.amount = amount;
    }
    public void withdraw(double amount){
        this.amount = amount;
        System.out.println("amount withdraw = " + amount);
    }
}