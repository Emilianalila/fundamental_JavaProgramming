package org.example.chapter7_arrays;

/* input: numbers from 1-5
   process:
output: string that represents the day of the week*/

import java.util.Scanner;

public class DayOfWeek_arraysExercise {
    public static void main(String[] args) {
        // variables we know
        String[] weekArray = {"Monday","tuesday", "wednesday", "thursday","friday"};
        // variables we don't know
        System.out.println("Enter the number for the day of the week between 1-5");
        Scanner scanner= new Scanner(System.in);
        int inputIndex = scanner.nextInt();
        scanner.close();
        //output
        String userDay = weekArray[inputIndex -1];
        System.out.println("The number you enter correspond to the day: "+ userDay+ "!!");

    }
}
