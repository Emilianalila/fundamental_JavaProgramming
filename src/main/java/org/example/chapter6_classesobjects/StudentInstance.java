package org.example.chapter6_classesobjects;
import java.util.ArrayList;
import java.util.Arrays;

/*This code's main target is to create a list of StudentsMold objects and then filter that list to get only
those students who are enrolled in a specific course "C" (Chemistry) using a ArrayList and a for loop.*/
/*ArrayList= It is a dynamic collection that can automatically resize as needed.
Allows you to add, delete and access elements efficiently.
Provides a variety of useful methods for manipulating the list, such as add(), remove(), get(), size(), among others.*/
public class StudentInstance {
   /*
    public static void main(String[] args) {
     StudentsMold student1 = new StudentsMold("Marcus", "Villalba", "Biology");//The "new" keyword followed by StudentsMold(...) creates new StudentsMold objects and initializes them with the provided values.
     StudentsMold student2 = new StudentsMold("Marchelo", "Argento", "Organic 1");
     StudentsMold student3 = new StudentsMold("Matias", "Lovelac", "Chemistry");
     StudentsMold student4 = new StudentsMold("Pancho", "Lovelac", "Organic 1");
     StudentsMold student5 = new StudentsMold("Patricia", "Lovelac", "Biology");
     StudentsMold student6 = new StudentsMold("Pato", "Lovelac", "Chemistry");
     StudentsMold student7 = new StudentsMold("Pepe", "Lovelac", "Chemistry");
        //System.out.println(student1);
        //new array which will contain all my students
        List<StudentsMold> studentsList = new ArrayList<>(); // The StudentsMold[] syntax indicates that StudentsList is an array containing objects of type StudentsMold.
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);
        studentsList.add(student6);
        studentsList.add(student7);
        //System.out.println(studentsList);
        // new array only with one course
        List <StudentsMold> organicCourse = new ArrayList<>(); // it is not necessary to add the initial capacity if I don't know the number, declaring an array of StudentsMold objects.
         // for (class item : array)
       for (StudentsMold student : studentsList) {
           if (student.getCourse().equals("Chemistry")){
             organicCourse.add(student); // how to add item to my new array list
           }
        }
        System.out.println(organicCourse);

    }*/

    public static void main(String[] args) {
        ArrayList<StudentsMold_ArrayList> arrayStudent = new ArrayList<>(Arrays.asList(// we create an ArrayList called arrayStudent that contains the StudentsMold objects specified as initial elements.
                new StudentsMold_ArrayList("Marcus", "Villalba", "Biology"),
                new StudentsMold_ArrayList("Marchelo", "Argento", "Organic 1"),
                new StudentsMold_ArrayList("Matias", "Lovelac", "Organic 1"),
                new StudentsMold_ArrayList("Pancho", "Lovelac", "Chemistry"),
                new StudentsMold_ArrayList("Patricia", "Lovelac", "Chemistry"),
                new StudentsMold_ArrayList("Pato", "Lovelac", "Biology"),
                new StudentsMold_ArrayList("Pepe", "Lovelac", "Chemistry"))
        );
        ArrayList<StudentsMold_ArrayList> chemistryCourse = new ArrayList<>();
        for (StudentsMold_ArrayList student : arrayStudent){
            if (student.getCourse().equals("Chemistry")){
                chemistryCourse.add(student);
            }
        }
        System.out.println(chemistryCourse);
    }
}
