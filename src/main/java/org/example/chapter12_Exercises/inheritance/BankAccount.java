package org.example.chapter12_Exercises.inheritance;
/*Write a Java program to create a class known as "BankAccount"
with methods called deposit() and withdraw().
Create a subclass called SavingsAccount that overrides the withdraw()
 method to prevent withdrawals if the account balance falls below one hundred.*/
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