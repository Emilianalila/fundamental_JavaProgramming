package org.example.chapter3_ifStatements;
import java.util.Scanner;
/*
if statement
all salespeople get a payment of $1000 a week.
salespeople who exceed 10 sales get an additional bonus of $250*/

public class SalaryCalculator {
    public static void main(String [] arg){
        //1_initialize know values
        int payment = 1000;
        int bonus = 250;
        int bonusSales = 10;

        //2_get values for the unknown
        System.out.println("Number of sales you did");
        Scanner scanner = new Scanner(System.in);
        int peopleSales = scanner.nextInt();
        scanner.close();

        //3_ Quit detour for the bonus earners
        if(peopleSales > bonusSales){// magic number "we don't know this number without further research" (hard coding)
            payment += bonus;
        }

        //4_ output
        System.out.println("The employee's payment is $" + payment);
    }
}
