package org.example.chapter4_loop;
import java.util.Scanner;
/*
While loop: Sentinel, scanner.close() outside the loop
_Each store employee makes $15 an hour. Write a program that allows the employee
to enter the number of hours worked for the week. do not allow overtime.
 */
public class GrossPayInputValidation {
    public static void main (String [] arg){
        // initialize know variables
        int rate = 15;
        int maxHours = 40;

        // get the inputs for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double workedHours = scanner.nextDouble();// space for catch the number and save it in a variable.


        // validate the condition
        while (workedHours > maxHours || workedHours < 1 ){ // we have to make sure that our loop do not run infinitely and the way you do that is: by using a "variable" that will be "updated" at some point within the loop, so this is called a "Sentinel" meaning this is what controls the flow of the loop in the condition. is important that in your loop there's an opportunity for the Sentinel to be updated.
            System.out.println("Invalid entry, Try again! maximum of worked hours are 40 and minimum hour, 1 ");
            workedHours = scanner.nextDouble(); // if we don't have this variable updating, we are going to use the same value always, the user entry , therefore this condition (work Hours > max Hours) is going to be true infinitely.
        }
        scanner.close();
        //calculate pay for each week
        double grossPayment = workedHours * rate;
        System.out.println("Great, Your salary is " + grossPayment);
    }
}

/*
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}
 */
