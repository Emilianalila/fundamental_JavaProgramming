package org.example.exercisesCollections.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<>(); // I create this collection, so I can save a list of Persons, persons are object type of person
        list1.add(new Person(1, "Emi", 34));
        list1.add(new Person(2, "Pancho", 35));
        list1.add(new Person(3, "Pepe", 36));
        list1.add(new Person(4, "Moni", 37));
        // to ways of iterate "ArrayList":

        //go through the index: advantage = I can go directly to a position by it its index number.
        for(int i= 0; i<list1.size(); i++){// here I can go directly to one specific position
            System.out.println("iterate the list with an index: " + list1.get(i).getName());//with list1.get(i) we are saying, give me the person in index i, and after that, we can concatenate with . because we already have the specific person in the list, and each person has a method for get only the name, otherwise is impossible to use directly the method
        }
        //forEach iterate element by element
        for (Person c: list1){// more used
            System.out.println("iterate the list with foreach:"+ c.getName()); // this
        }

    }
}


/*To get the length of a collection in Java, you can use the size() method.
This method is available for classes that implement the Collection interface,
such as ArrayList, LinkedList, HashSet, among others.*/

/*You cannot use length() on Java collections because length is an attribute that belongs to arrays,
while collections, like ArrayList, LinkedList, etc., are not arrays.
In Java, arrays are special objects that have a property called length to determine their size.
 On the other hand,(collections are interfaces or classes) that implement the Collection interface,
 and have a size() method instead of a length attribute to obtain their size.
 I can use length in arrays and String because both are object*/