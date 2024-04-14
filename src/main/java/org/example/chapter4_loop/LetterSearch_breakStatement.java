package org.example.chapter4_loop;
import java.util.Scanner;
/*
Loop break, continue and debug.
search a string to determine if it contains the letter 'A'.
*/
public class LetterSearch_breakStatement {
    public static void main(String [] arg){
        //get the text
        System.out.println("Enter some text...");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;
        //search the text for letter 'A'
        for (int i = 0; i < text.length(); i++) { // here we can put a breakpoint to use the debugger and see how the loop works in each line
            char currentLetter = text.charAt(i); //converting my text in letters, so I can iterate over it.
            if (currentLetter == 'a' || currentLetter == 'A'){
               letterFound = true;
               break;//we are going to exits the loop no matter which iteration we are
            }
        }

        if (letterFound){
            System.out.println("The text contains the letter 'A'.");
        }else{
            System.out.println("The text doesn't contains the letter 'A'.");
        }
    }
}
