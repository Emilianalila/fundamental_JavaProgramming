package org.example.exercisesCollections.set_interface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("HashSet.....................................");
        Set<String> newHashSet = new HashSet<>(); // only unique elements to save in unordered list
        newHashSet.add("Peru");
        newHashSet.add("Paraguay");
        newHashSet.add("Bolivia");
        newHashSet.add("Argentina");
        newHashSet.add("Argentina");
        System.out.println("newHashSet = " + newHashSet);

        System.out.println("TreHashSet..................................");

        Set <String> newTreeHash = new TreeSet<>();
        newTreeHash.add("Emi");
        newTreeHash.add("Adela");
        newTreeHash.add("Zorro");
        newTreeHash.add("Pedro");
        newTreeHash.add("Pedro");//we only print unique elements
        System.out.println("newTreeHash = " + newTreeHash); // ordered list by the alphabet

        System.out.println("LinkedSet......................................");
        Set <Integer> newLinkedList = new LinkedHashSet<>();
        newLinkedList.add(5);
        newLinkedList.add(4);
        newLinkedList.add(1);
        newLinkedList.add(10);
        newLinkedList.add(10); // we only print unique elements
        System.out.println("newLinkedList = " + newLinkedList);// unordered list
    }
}
