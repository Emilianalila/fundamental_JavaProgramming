package org.example.chapter5_Methods;

import java.util.Scanner;

/*
Variable scope:
write an instant credit check program that approves anyone
who makes more than $25,000 and has a credit score
of 700 or better. Reject all others.
 */
public class InstantCreditCheck_Scope {
    static double salaryMinimum= 25000; //without dot.
    static double creditScore = 700; // because our methods are static, we are going to also need to declare our global variables as static as well
    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {// used to control the flow
        //initialize the variables we know
        // get the unknown variables
        int userScore =  getScore();
        double userSalary= getSalary();
        scanner.close(); // we have to put it here because the main method is going to control the flow.
        // check if the user is qualified and notify the user
        isUserQualified(userScore,userSalary);
    }
    public static int getScore(){
        System.out.println("Enter your credit Score");
        int applicantScore = scanner.nextInt();
        return applicantScore; // esta en amarillo because we repeat the name twice and we are not used it .
    }
   public static double getSalary(){
       System.out.println("Enter your Salary");
       return scanner.nextDouble(); // better way
   }
   public static void isUserQualified(int score, double salary){// static method
       if (score >= creditScore && salary >= salaryMinimum) {
           System.out.println("Congrats, you've been approved");
       }else{
           System.out.println("Sorry, you don't have the minimum standard require" );
       }
   }
}


