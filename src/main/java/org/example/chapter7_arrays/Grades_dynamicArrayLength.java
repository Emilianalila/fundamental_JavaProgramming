package org.example.chapter7_arrays;
import java.util.Arrays;
import java.util.Scanner;
/*How big the array should be ? when we don't know, so, how we can crete a dynamic array length?*/

/*1_ create a program that allows the user to enter any number
* of grades and provides them with their average score, as well as the highest and lowest scores*/
public class Grades_dynamicArrayLength {

    private static Scanner scanner = new Scanner(System.in);
    private static int [] grades;

    public static void main(String[] args) {// all static, otherwise doesn't work
        // depending of the grade number that the user's enter, is going to be the length of our array
        System.out.println("How many grades are you going to enter?");
        grades = new int[scanner.nextInt()]; //this is a static array therefore when I declared I need to specify the size. the size is entered directly by the user
        //create the arrays of grades
        getGrades();
        // iterate the array and create the accumulator to find the average score.
       double averageScore = getAverage();
        System.out.println("Your average score is: "+String.format("%.2f",averageScore)+"!!");// String.format ask me for a double
        // highest score
        int highest= highestScore();
        System.out.println("Your highest score is: "+highest);
        // lowest score
        int lowest= lowestScore();
        System.out.println("Your lowest score is: "+lowest);
        System.out.println("Your lowest algorithm is: "+lowest2());
        scanner.close();
    }
    public static int[] getGrades(){ // this methods return an arrays
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter the grades number "+ (i+1)+":");
            grades[i] = scanner.nextInt();// how to assign items to an array !!!!!!!!!!!!!!!.....................
        }
        return grades;
    }
    public static int getAverage(){
        int sumGrades = 0;
        for(int item : grades){
            sumGrades += item;
        }
        int average = sumGrades/grades.length;
        return average;
    }
    public static int highestScore(){
        Arrays.sort(grades);
        return grades[grades.length -1];
    }
    public static int lowestScore(){
        Arrays.sort(grades);
        return grades[0];
    }

    //algorithm for take the lowest or highest number of an array
    public static int lowest2 (){
        int lowest = grades[0];
        for(int item : grades){
            if (item < lowest){
                lowest = item;
            }
        }
        return lowest;
    }





}
