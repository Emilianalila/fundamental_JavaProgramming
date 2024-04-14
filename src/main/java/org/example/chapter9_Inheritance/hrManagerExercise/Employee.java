package org.example.chapter9_Inheritance.hrManagerExercise;

public class Employee {
    private int salary;
    //constructor
    public Employee(int salary){
        this.salary = salary;
    }
    //getter and setters
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    //extra method
    public void work(){
        System.out.println("you have to work");
    }

}
