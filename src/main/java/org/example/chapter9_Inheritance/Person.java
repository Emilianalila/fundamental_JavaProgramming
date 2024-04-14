package org.example.chapter9_Inheritance;

public class Person {
    private String name;
    private int age;
    private String gender;
    // default constructor and another constructor more
    /*public Person(){
        System.out.println("Superclass Person constructor");
    }*/
    public Person(String name){// "super" constructor or second constructor
        System.out.println("In Person 2nd constructor. name is set");
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
