package org.example.chapter2_javaFundamentals;
import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] arg){ // Default method (in order to run any code form inside a class we need to create a method)
        //1. get the number of hours worked.................................
        System.out.println("Enter the number of hours the employee worked."); // to display an output to the console
        Scanner scanner = new Scanner(System.in); // to "receive" an input from the console - we have to import the class Scanner - "System.in" with Scanner, we are saying that we want to "read" user input from the keyboard.
        int hours = scanner.nextInt(); // for read the information that the user type "depending" of the info, number, boolean or hours(two numbers), etc.

        //2. get the hourly pay rate.......................................
        System.out.println("Enter the employee's pay rate");
        double rate = scanner.nextDouble();
        scanner.close(); // after reading the information, the scanner must be closed to free up the memory space.

        //3. Multiply hours and pay rate...................................
         double grossPay = hours * rate;

        //4. Display result.............................................
        System.out.println("The employee's gross pay is $" + grossPay);

    }
}

/*In Java, the Scanner class is like your friend that helps you read what you wrote. When you do "Scanner" scanner = new Scanner(System.in);,
you are saying that you want to create a new friend named scanner. And when you type "System.in", you're basically telling your friend that "they should read" what you type in the console,
that is, what you type on the "keyboard".
So System.in is like a window to whatever you type in the console, and Scanner helps you read what you type there.*/


