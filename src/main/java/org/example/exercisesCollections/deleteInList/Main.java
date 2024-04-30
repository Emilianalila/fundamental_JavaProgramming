package org.example.exercisesCollections.deleteInList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Person> list1= new ArrayList<>();
        list1.add(new Person(1, "Emi", 55));
        list1.add(new Person(2, "Pato", 56));
        list1.add(new Person(3, "Irini", 57));
        list1.add(new Person(4, "Jacko", 58));

        list1.remove(2);
        list1.remove(2);// how we remove objects from our ArrayList?, through the index

        for(int i=0; i<list1.size(); i++){
            System.out.println("list with ArrayList: " + list1.get(i).getName());// we have to use get(i) to get the "element" specific objet first, then we can access to the particular property like name
            System.out.println("what size have my list? "+ list1.size());
        }
        for(Person item: list1){
            System.out.println("list with ArrayList (forEach) = " + item.getName());
        }
        System.out.println("LinkedList......................................................");
        List <Person> list2 = new LinkedList<>();
        list2.add(new Person(89, "Pepe", 45));
        list2.add(new Person(90, "Pepe1", 45));
        list2.add(new Person(91, "Pepe2", 45));
        list2.add(new Person(92, "Pepe3", 45));

        String deleteName = "Pepe2"; // for remove an object in a LinkedList, we need to give at least one property to compare with the object that we are iterating
        for(Person c: list2){
            if (c.getName().equals(deleteName)){// we choose the property in the current element and compared with the method equal
                list2.remove(c);            // here we remove the "entire" object.
                break;                      // we always need to stop the iteration because we break the List and we can't continue iterating
            }
        }

        for(Person c: list2){
            System.out.println("c = " + c.getName());
        }
        System.out.println("specific methods to a LinkedList: getFirst(), getLast()");
        System.out.println("get the First element in the list= "+ list2.getFirst()); // toString() works is I put it here or not, because I already have in class Person
        System.out.println("get the Last element in the list= "+ list2.getLast().toString());

        System.out.println("delete all the list ");// clear() work for ArrayList and LinkedList
        list2.clear();
        System.out.println("is the list empty? " +  list2.isEmpty());// check is the list is empty = true
        System.out.println();
    }
}
