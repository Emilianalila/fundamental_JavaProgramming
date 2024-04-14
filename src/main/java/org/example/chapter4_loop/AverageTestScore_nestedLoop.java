package org.example.chapter4_loop;
import java.util.Scanner;
/*
Nested loops:
Find the average of each student's test scores.
 */
public class AverageTestScore_nestedLoop {
    public static void main(String [] arg){
        int numberOfStudents = 2;
        int numberOfTest = 3;

        Scanner scanner = new Scanner(System.in); //we can create one scanner en use in the entire class.

        //process all students
        for (int i = 0; i < numberOfStudents; i++) {
            int grades = 0;
            for (int j = 0; j < numberOfTest; j++) {
                System.out.println("Which is the grade of your test " +(j + 1)+"?");
                int gradeTest = scanner.nextInt();
                grades += gradeTest;
            }
            int totalAverage = grades / numberOfTest;
            System.out.println("Student "+(i+1)+": Average: " + totalAverage);
        }
        scanner.close();
    }
}
