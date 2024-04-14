package org.example.chapter2_javaFundamentals;
import java.util.Scanner;
public class MadLibs {
    public static void main(String[] arg){
        System.out.println("Choose a season of the year");
        Scanner scanner = new Scanner(System.in); // Scanner is like my element input
        String season = scanner.nextLine();// It means that the Scanner will be waiting for the user to enter something from the console.

        System.out.println("A hole number");
        int wholeNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the blank new line (the new line \n is entered by the user when they press the enter key, when using methods like "nextInt()" of the "Scanner class" [scanner.next()], this does not happen with nextLine() for example)

        System.out.println("Add an adjective");
        String adjective = scanner.nextLine();

        System.out.println("On a "+ adjective +" "+ season + " day, I drink a minimum of " + wholeNumber + " cup of coffee.");
    }
}




/*The new line is not created by your code, but is entered by the user when they press the "Enter" key after entering the number.
When the user enters a number and presses "Enter", the number is captured in the variable, but the newline character (\n) representing the "Enter" key is left in the input stream buffer.
 When trying to read the next text entry, as in the case of the nextLine() method, this method reads the rest of the current line until it finds the next newline character,
 which was left in the buffer previously. This can cause nextLine() to appear to "skip" user input after a nextInt().*/