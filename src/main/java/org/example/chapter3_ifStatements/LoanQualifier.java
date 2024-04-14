package org.example.chapter3_ifStatements;
import java.util.Scanner;
/*
Nested if
To qualify for a loan, a person must make at least $30,000
and have been working at their job for at least 2 years.
 */
// souTv ( con el string) souT (sin el string)
//if I want to compare if two string are equal to each other I use if(string1.equals(string2)) if I use == this operator is going to check if the memory location of both string not the value
// chart is another type of value used for letters, and they go inside single quotes.

public class LoanQualifier {
    public static void main(String [] arg){
        // initialize what we know
        int requiredSalary = 30000;
        int requiredYears = 2;

        //get the unknown values
        System.out.println("which is your salary?");
        Scanner scanner = new Scanner(System.in);
        double personSalary = scanner.nextDouble();

        System.out.println("How many years did you work in your current job?");
        int personYearsWorked = scanner.nextInt(); // we don't need to declare new Scanner again, we already did

        scanner.close();

        // make decision with the if statement
        if(personSalary > requiredSalary){
            if(personYearsWorked >= requiredYears ){
                System.out.println("Congrats you qualify for the loan!!");
            }else{
                System.out.println("You must have worked at least " + requiredYears + " at the same company");
            }
        }else{
          System.out.println("You need to make at least $" + requiredSalary + " to apply to the loan");
        }
    }
}
