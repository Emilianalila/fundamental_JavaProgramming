package org.example.exercisesCollections.grades_hashMap;

import java.util.HashMap;
import java.util.Map;

import static org.example.exercisesCollections.grades_hashMap.TestResults.getMakeUpGrades;
import static org.example.exercisesCollections.grades_hashMap.TestResults.getOriginalGrades;

public class Main {
    public static void main(String[] args) {
        //we don't need to instantiate the class TestResults to use the static method, because is "static", otherwise is necessary to instantiate an object of the class where we stored the method: TestResults test1 = new TestResults(); test1.etOriginalGrades()
        Map<String, Integer> originalGrades = TestResults.getOriginalGrades(); // calling to a static method through the class
        Map<String, Integer> makeUpGrade = TestResults.getMakeUpGrades(); //collection of pairs key-vale
        System.out.println("originalGrades = " + originalGrades);
        System.out.println("makeUpGrade = " + makeUpGrade);

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
        System.out.println("finalGrades = " + finalGrades);
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