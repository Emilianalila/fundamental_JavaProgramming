package org.example.ExercisesClasses.employeeClass;

public class Developer extends Employee{
    //
    private String programmingLanguage;
    //
    public Developer(String fullName, String address, double salary, String jobTitle, String programmingLanguage) {
        super(fullName, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }
    //
    public String getProgrammingLanguage(){
        return programmingLanguage;
    }
    //
    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public String performanceReport() {
        return null;
    }

    @Override
    public String managingProjects() {
        return null;
    }
}
