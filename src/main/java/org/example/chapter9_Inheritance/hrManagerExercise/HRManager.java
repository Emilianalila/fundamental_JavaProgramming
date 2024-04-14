package org.example.chapter9_Inheritance.hrManagerExercise;

public class HRManager extends Employee {
    // constructor
    public HRManager(int salary){
        super(salary); //I needed otherwise this class ask for a default constructor in my superclass
    }
    // overriding this method because HR does another type of work
    @Override
    public void work() {
        System.out.println("HR work");
    }
    //extra method
    public void addEmployee(){
        System.out.println("adding a new employee ");
    }
}
