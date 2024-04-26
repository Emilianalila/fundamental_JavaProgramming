package org.example.chapter5_Methods.static_Exercises;

import org.example.chapter5_Methods.static_Exercises.Tickets_Id_counter;

public class Tickets_newObjects {
    public static void main(String[] args) { // when I initialize values in my mold , I have to do it inside the main

        // instances of the new objects "tickets with different id "
        Tickets_Id_counter ticket1 = new Tickets_Id_counter("Monday","Shakira"); // my String always with double quotes
        Tickets_Id_counter ticket2 = new Tickets_Id_counter("Tuesday","Pedro");
        Tickets_Id_counter ticket3 = new Tickets_Id_counter("Saturday","Sancho");
        Tickets_Id_counter ticket4 = new Tickets_Id_counter("Wednesday","Paquita la del Barrio");

        System.out.println(ticket1); // if I want to use system, I have to create first the method toSting ()
        System.out.println(ticket2);
        System.out.println(ticket3);
        System.out.println(ticket4);
    }
}
