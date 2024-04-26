package org.example.exercisesCollections.linkedList.employee;

import java.util.HashMap;
import java.util.Map;

public class Main_hashMap {
    public static void main(String[] args) {
        //A_ declare a hashMap
        Map<Integer, String> employees = new HashMap<>();
        //B_ adding pairs to the collection
        employees.put(1, "Emiliana Escobar");
        employees.put(2, "Elsa Esmeralda");
        employees.put(3, "Elena Perez");
        System.out.println("employees = " + employees);
        //C_ getting the value of one key and assigning to the variable newHr
        String newHr = employees.get(1);
        System.out.println("newHr = " + newHr);
        //D_verify if the key 3 is saving in the collection
        System.out.println("employees with key 2, exists? = " + employees.containsKey(2));
        //E_delete pair 2
        employees.remove(2);
        System.out.println("update employees = " + employees);
        //F_it returns me an array of values and keys
        System.out.println("employees keys = " + employees.keySet());
        System.out.println("employees values= " + employees.values());

        
    }
}
