package org.example.chapter5_Methods.static_Exercises;
import java.time.LocalDate;

public class Ticket2 {
    // fields that belong to the objects
    private int number;
    private LocalDate dueDate;
    private String artistName;
    //field that is going to belong to the class (global value)
    private static int counter= 100;

    public Ticket2(LocalDate dueDate, String artistName){
        counter++; // each new ticket is going to have a number that is going to continue with the last one
        this.number = counter; // we generate the value of the number automatic using the class field
        this.dueDate = dueDate;
        this.artistName = artistName;
    }

    public String getArtistName (){
        return artistName;
    }

    @Override
    public String toString() {
        return "Ticket2{" +
                "number=" + number +
                ", dueDate=" + dueDate +
                ", artistName='" + artistName + '\'' +
                '}';
    }
}
