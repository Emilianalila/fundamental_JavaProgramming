package org.example.chapter4_loop;
import java.util.Scanner;
/*
for Loop:
write a cashier program that will scan a given number of items and tally the cost.
 */
public class CashierForLoops {
    public static void main(String [] arg){
        // get the number of items to scan
        System.out.println("How many items do you have?");
        Scanner scanner = new Scanner(System.in);
        int itemsQuantity = scanner.nextInt();

        double total= 0;
        // create a loop to iterate through "all" of the items and accumulate the cost.
        for (int i = 0; i < itemsQuantity; i++) { // int i ("is the sentinel") a for loop have a count-controlled
            System.out.println("Enter the cost of the item");
            double price = scanner.nextDouble();// when I'm entry a Double number, I can do it with (.) not with (coma)
            total += price; // Accumulator
        }
        scanner.close();

        //tell the cashier the cost of the tally
        System.out.println("The tally is: $" + total); // the total is






    }
}
