package org.example.ExercisesClasses.employeeClass;

public abstract class Employee {
    //fields
    private String fullName;
    private String address;
    private double salary;
    private String jobTitle;

    //constructor
    public Employee(String fullName, String address, double salary, String jobTitle){
        this.fullName = fullName;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    //getters
    public String getFullName(){
        return fullName;
    }
    public String getAddress(){
        return address;
    }
    public double getSalary (){
        return salary;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    //abstract methods to override in the subclasses
    public abstract double calculateBonus();
    public abstract String performanceReport();
    public abstract String managingProjects();

    //


    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
