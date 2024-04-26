package org.example.chapter5_Methods.static_Exercises;
/*this class creates different tickets with a counter
which is going to assign different numbers to my attributes id.*/

public class Tickets_Id_counter { //mold to build objects
    //class attributes(class variable), The word "static" refers to the fact that the counter will be a value shared by all objects and not a value that each one has separately.
    private static int counter; //is a value that all new objects "share"

    // object attributes (instance variables) "each object will have all these attributes separately"
    private int id;
    private String day;
    private String nameConcert;

    // constructor
    public Tickets_Id_counter(String day, String nameConcert){ //each object will be constructed in the constructor changing the value of the counter in each construction
        counter ++; //Each object will modify "this value" that belongs to the class and that is why each object will have a different value each time it is constructed.
        this.id = counter;
        this.day = day;
        this.nameConcert = nameConcert;
    }
    // method toString It will allow us to convert this ticket_id into a string that can be represented in the console
     public  String toString(){
        return "Ticket {" + "id = " + id + ", Day = "+ day + ", concert Name = "+ nameConcert + "}";

     }
}
