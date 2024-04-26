package org.example.exercisesClasses.inheritance;

public class SavingsAccount extends BankAccount{
    private double accountBalance;
    //
    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    // override methods from the super class
    @Override
    public void deposit(double amount) {
        accountBalance += amount;
    }
    @Override
    public void withdraw(double amount ) {
        if (accountBalance < 100){
            System.out.println("withdraw not allow, your account balance is below 100");
        }else{
            accountBalance = accountBalance - amount;
            System.out.println("withdraw successful: "+ amount );
        }
    }

}
