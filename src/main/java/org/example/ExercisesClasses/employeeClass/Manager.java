package org.example.ExercisesClasses.employeeClass;

public class Manager extends Employee{
    public Manager(String fullName, String address, double salary, String jobTitle) {
        super(fullName, address, salary, jobTitle);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }

    @Override
    public String performanceReport() {
        return "Performance report for Manager " + getFullName() + ": Excellent";
    }

    @Override
    public String managingProjects() {
        return null;
    }
}
