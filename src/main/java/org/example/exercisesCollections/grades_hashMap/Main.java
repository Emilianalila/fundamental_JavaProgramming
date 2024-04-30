package org.example.exercisesCollections.grades_hashMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.example.exercisesCollections.grades_hashMap.TestResults.getMakeUpGrades;
import static org.example.exercisesCollections.grades_hashMap.TestResults.getOriginalGrades;

public class Main {
    public static void main(String[] args) {
        //we don't need to instantiate the class TestResults to use the static method, because is "static", otherwise is necessary to instantiate an object of the class where we stored the method: TestResults test1 = new TestResults(); test1.etOriginalGrades()
        Map<String, Integer> originalGrades = TestResults.getOriginalGrades(); // calling to a static method through the class
        Map<String, Integer> makeUpGrade = TestResults.getMakeUpGrades(); //collection of pairs key-vale
        System.out.println("originalGrades = " + originalGrades);
        System.out.println("makeUpGrade = " + makeUpGrade);
       //how we are going to declare the new hashMap? first we choose the "interface" that we are going to implement (Map),
        Map<String, Integer> finalGrades = new HashMap<>();
        //     one key     many keys
        for (String key : originalGrades.keySet()) {
            Integer value = originalGrades.get(key);
            //System.out.println("value = " + value);
            for (String key2 : makeUpGrade.keySet()) {
                Integer value2 = makeUpGrade.get(key2);
                if (key.equals(key2)) {
                    if (value2 > value) {
                        finalGrades.put(key2, value2);
                    } else if (value > value2) {
                        finalGrades.put(key, value);
                    } else {
                        finalGrades.put(key, value);
                    }
                }
            }
        }
        System.out.println("finalGrades = " + finalGrades); // unordered list



        System.out.println("TreeMap...................................................................................");
        Map<String, String> newTreeMap = new TreeMap<>();
        newTreeMap.put("Biology", "Patricia");
        newTreeMap.put("Anatomy", "Aldo");
        newTreeMap.put("Chemist", "Lucho");

        System.out.println("newTreeMap = " + newTreeMap); // ordered list by the first letter of the key

        System.out.println("LinkedHashMap............................................................................");
        Map <Integer, String> newLinkedMap = new LinkedHashMap<>();
        newLinkedMap.put(1, "Emi");
        newLinkedMap.put(2, "pepe");
        newLinkedMap.put(3, "toto");
        newLinkedMap.put(4, "tutu");
        newLinkedMap.put(2,"pepe");// we repeat one element, but is not included in the list
        System.out.println("newLinkedMap = " + newLinkedMap);
    }
}








/* originalGrades.forEach((key, value) -> {
            Integer makeUpValue = makeUpGrade.get(key);
            if (makeUpValue != null) {
                finalGrades.put(key, Math.max(value, makeUpValue));
            } else {
                finalGrades.put(key, value);
            }
        });
*/