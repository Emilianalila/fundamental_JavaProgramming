package org.example.chapter4_loop;
import java.util.Random;
/*
Roll the Die Game:
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
Roll the die for the user (generate a Random number between 1 - 6) and advance (move forward) the user that number
of spaces on the game board. [Code for this is in Independent Exercise section]
After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
Repeat this 4 additional times for 5 rolls in total.
However, if the user gets to 20 before 5 rolls, end the game - they've won.
If they are greater than or less than 20 spaces exactly, they lose.
Remember there are only 20 spaces on the board, so a message like "You advanced to space 22" is a bug.
 */
public class RollTheDieGame_nestedLoop {
    public static void main(String []arg){
        //initialize the variables that we have
        int winSpaces = 20;
        int maximumRoll = 5;
        Random random = new Random();

        System.out.println("Welcome to roll the Die! Let's begin...");

        //creating the random number between 1-6 and move forward that number of space
        int totalSpaces = 0;
        int currentPosition = 0;

        for (int i = 1; i <= maximumRoll; i++) {
            int die = random.nextInt(6) + 1; //The nextInt(6) method generates a random number between 0 (inclusive) and 6 (exclusive), that is, it produces random numbers in the range 0 to 5. Then, 1 is added to the result to obtain a random number between 1 and 6 not 0 to 5.
            System.out.println("Roll the die, is your opportunity: "+ i +"  die:"+die);
             currentPosition += die;
            System.out.println("You move forward : "+die + " spaces, your new position is: " + currentPosition);
            totalSpaces += die;
            if (currentPosition == winSpaces){
                System.out.println("Congrats!! You Win the Game, in your opportunity: "+ i);
                break;
            }
        }
        int finalSpaceUser = totalSpaces;
        int howManyLess = finalSpaceUser - winSpaces;
        int howManyMore = winSpaces - finalSpaceUser;

        // tell the user which space they are and how many more to win
        if (finalSpaceUser < winSpaces){
            System.out.println("You lose the Game.., your final position is: " + finalSpaceUser+ " and you need: "+ howManyMore+ " spaces to win!");

        }else if(finalSpaceUser > winSpaces){
            System.out.println("You lose the Game.., your final position is: " + finalSpaceUser+ " and you past: "+ howManyLess+ " spaces to win!");
        }else{
            System.out.println("You reach the winner position: " + finalSpaceUser+"!!......");
        }

    }
}


