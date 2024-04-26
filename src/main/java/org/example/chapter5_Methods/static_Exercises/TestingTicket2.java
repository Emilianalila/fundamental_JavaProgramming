package org.example.chapter5_Methods.static_Exercises;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestingTicket2 {
    public static void main(String[] args) {
        List <Ticket2> list2 = new ArrayList<>();
        list2.add(new Ticket2( LocalDate.now(), "Shakira"));
        list2.add(new Ticket2( LocalDate.now(), "Shakira"));
        list2.add(new Ticket2( LocalDate.now(), "Shakira"));
        list2.add(new Ticket2( LocalDate.now(), "Shakira"));

        for(int i=0; i<list2.size(); i++){
            System.out.println("list2 = " + list2.get(i)); // I can see the value of his attributes in that instant of each object
        }
        System.out.println("list of tickets= " + list2); // if we don't use the method toString, this println is going to show the reference where the object It's save, not the actual values of each object in the list, why? because this list points to "objects", is the same with variables, if we have a variable that points to an object, we are not going to be able to see his content because is pointing to an object


        System.out.println("insert the number of tickets you want");
        Scanner scanner = new Scanner(System.in);
        int numberOfTickets = scanner.nextInt(); // we are generate an extra line /n
        System.out.println("numberOfTickets = " + numberOfTickets);
        scanner.nextLine(); //consume the extra line that nextInt() generate

        System.out.println("enter a string..");
        Scanner scanner1 = new Scanner(System.in);
        String newString = scanner.nextLine();
        System.out.println("newString = " + newString);
        scanner.close();
        

    }
}
