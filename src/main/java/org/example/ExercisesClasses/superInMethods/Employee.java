package org.example.ExercisesClasses.superInMethods;

public class Employee extends Person{
    private int employeeId;
    private String title;

    public Employee(String firstName, String lastName, int employeeId, String title) {
        super(firstName, lastName); // from superClass and first declaration
        this.employeeId = employeeId;
        this.title = title;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getTitle(){
        return title;
    }
    //
    @Override
    public String getLastName() {
         return super.getLastName()+ ", " + title; // this type of call is useful, when the subclass want to use or extend the functionality of the superclass method without replacing or overriding completely
    }

}
