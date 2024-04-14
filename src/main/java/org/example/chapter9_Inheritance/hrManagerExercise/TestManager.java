package org.example.chapter9_Inheritance.hrManagerExercise;

public class TestManager {
    public static void main(String[] args) {
        HRManager manager1 = new HRManager(30000);
        System.out.println("manager1 salary= " + manager1.getSalary());
        manager1.work();
        manager1.addEmployee();

        Employee employee1 = new Employee(27000);
        System.out.println("employee1 salary= " + employee1.getSalary());
        employee1.work();

    }


}
