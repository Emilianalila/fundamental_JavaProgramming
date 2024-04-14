package org.example.chapter6_classesobjects;

public class StudentsMold_ArrayList {
    // instance variable
    private int id;
    private String name;
    private  String lastName;
    private String course;

    // class variable
    private static int counterId;

    // getter and setter for name
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    //constructor
    public StudentsMold_ArrayList(String name, String lastName, String course){
        counterId ++;
        this.id = counterId;
        this.name = name;
        this.lastName = lastName;
        this.course = course;
    }

    //method toString()
    public String toString(){
        return "Student: [Id: " +id+", Name: " + name+", Last name: " +lastName+ ", Course: " + course+ " ]";

    }
}
