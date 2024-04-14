package org.example.chapter12_Exercises.inheritance;

public class TestBankAccount {
    public static void main(String[] args) {
       /* BankAccount client1 = new BankAccount();
       client1.deposit(67);
        System.out.println(" deposit client1 = " + client1.getAmount());
        client1.withdraw(100);*/
        //System.out.println("client1.withdraw(100); = " + client1.withdraw(100););
        double deposit = 50;
         SavingsAccount client1= new SavingsAccount();
         client1.setAccountBalance(180);
         client1.deposit(deposit);
         client1.withdraw(156.50);
        System.out.println(" Account balance client1 = " + client1.getAccountBalance() + " & deposit=  "+ deposit);


    }
}
