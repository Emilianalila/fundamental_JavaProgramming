package org.example.chapter3_ifStatements;
/*
if else
*All salespeople are expected to make at least 10 sales each week.
*For those who do, they receive a congratulation message.
*For those who don't, they are informed of how many sales they were short.
*/

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] arg){
        //1_ Initialize know values
        int salesQuota = 10;
        int  shortSales = 0;

        //2_get the number of sales of each salesPeople (unknown values)
        System.out.println("How many sales did you do this week");
        Scanner scanner= new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //3_ detour for the message and output.
        if (sales >= salesQuota) // if we have only one statement the curly braces are not necessary.
            System.out.println("Congrats, you reach the quota!!");
        else{
            shortSales = salesQuota - sales;
            System.out.println("You are " + shortSales + " sales short this week to reach your goal! ");
        }
    }
}
