package org.example.chapter7_arrays;
import java.util.Random;
/*The output is the printing of the generated ticket on the console.*/
/*Create a lottery quick pick application that will generate a lottery ticket with 6 random numbers between 1-69*/

public class RandomTicket {
    private static final int LENGTH = 6; // constant field
    private static final int MAXTICKETNUMBER = 69; // constant field
    public static void main(String[] args) {
     int[] ticket = getRandom();
        System.out.println("your ticket random is: "+ ticket); // what is displayed in the console is the reference to the object rather than the value of the object itself. This occurs because non-primitive variables (objects) in Java contain a reference to the memory location where the object is stored, rather than directly containing the value of the object.
        printTicket(ticket); // 10 | 68 | 48 | 24 | 14 | 14 |
    }
    public static int[] getRandom(){ // This method will return an array as the data type
      int[] ticket = new int [LENGTH];
        Random random = new Random(); // we have to generate 6 random numbers , is because we use a count control for loop to not repeat code
        for (int i = 0; i < LENGTH; i++) {
            ticket[i]= random.nextInt(MAXTICKETNUMBER) + 1;
        }
        return ticket;
    }

    public static void printTicket(int ticket []){// here we have an array as a parameter, we iterate inside of that array and we print those number out
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");//just print will return each number of the array in the same line and add a space and a pipe to separate them
        }
    }
}
