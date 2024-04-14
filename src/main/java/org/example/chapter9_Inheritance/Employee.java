package org.example.chapter9_Inheritance;
/*to inherit from another class within the subclasses header,
we use the keyword "extend" this word form an inheritance relationship */

public class Employee extends Person{
    private int employeeId;
    private String title;

    // defining explicitly the default constructor. if I define a default constructor in my subclass, without having any explicitly default constructor in my superclass, the constructor of my subclass is going to be call first, but only because I dont have any default in my superclass
    public Employee(){ // "super must be the first statement "
        super("text"); // if I want to call a second constructor in the superclass, I use this word "super" and if the second method ask for a parameter, I need to put the parameter here so the superclass know which method I am calling and is going to be the one who matches the parameter list
        System.out.println("Subclass constructor");// second constructor call, first we will see
    }

    //getter and setters
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
