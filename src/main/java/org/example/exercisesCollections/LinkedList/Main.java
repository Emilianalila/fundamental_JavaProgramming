package org.example.exercisesCollections.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {// the declaration is going to be the same, but the type is going to be LinkedList
        List <Person> list1 = new LinkedList<>();
        //adding item to the end of the list
        list1.add(new Person(90,"Paola", 18)); //fifo
        list1.add(new Person(91,"Pipi", 18));
        list1.add(new Person(92,"Pancho", 18));
        list1.add(new Person(93,"Poncho", 18));
        // adding to the beginning of the list with "0"
        list1.add(0, new Person(8, "first",98));

       // for(int i= 0; i<list1.size(); i++) for linkedList we can not use for by index
        for(Person per: list1){
            System.out.println("iteration by element: " + per.getName());
        }
    }
}
