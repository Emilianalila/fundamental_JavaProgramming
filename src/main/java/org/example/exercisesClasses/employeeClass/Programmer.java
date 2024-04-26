package org.example.exercisesClasses.employeeClass;

public class Programmer extends Developer{

    public Programmer(String fullName, String address, double salary, String jobTitle, String programmingLanguage) {
        super(fullName, address, salary, jobTitle, programmingLanguage);
    }

    @Override
    public double calculateBonus() {
        return 0;
    }

    @Override
    public String performanceReport() {
        return null;
    }

    public void debugCode(){
        //custom method
        int numero = 78;
        System.out.println("Programer " + getFullName() + " is debugging in " + getProgrammingLanguage());
    }

}
