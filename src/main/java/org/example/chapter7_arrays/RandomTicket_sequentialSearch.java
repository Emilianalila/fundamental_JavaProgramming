package org.example.chapter7_arrays;
import java.util.Arrays;
import java.util.Random;
/*Create a lottery quick pick application that will generate
 a lottery ticket with 6 random numbers between 1-69*/
public class RandomTicket_sequentialSearch {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = getRandom();
        Arrays.sort(ticket);
        printTicket(ticket); // 10 | 68 | 48 | 24 | 14 | 14 |
    }
    public static int[] getRandom(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            do {// do this: "create a random number" while the conditions is true , the while, always execute ones, but the second time, check if the condition is true and re-do another random number, otherwise goes out from the conditional do-while
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while (search(ticket, randomNumber)); // is going to be false, all the time almost

            ticket[i] = randomNumber;
        }
        return ticket;
    }
    /** (javadoc) it define how to use our method search
     * Does a sequential search on the array to find a value
     * @param   (ticket) array to search through
     * @param   (randomNumber)  value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] ticket, int randomNumber) {
        for (int element : ticket) { // enhanced loop
            if (element == randomNumber) {
                return true;
            }
        }
        return false; // if we have reach this point, then the entire arrays was searched and the element was not found (we don't have duplicate number)
    }

   /* public static boolean binarySearch(int[] ticket, int randomNumber){
        // first step (array must be sorted)
        Arrays.sort(ticket);//ascending order
        //second step, using the: ....
        int index = Arrays.binarySearch(ticket, randomNumber);
        if (index >= 0){ // or just return index >= 0;
            return true;
        }else {return false;}
    }*/
    public static void printTicket(int[] ticket){
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }
}
