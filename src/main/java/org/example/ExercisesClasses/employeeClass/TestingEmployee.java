package org.example.ExercisesClasses.employeeClass;

public class TestingEmployee {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Romina Rohin", "Alekistevej 90", 45000.00, "UX designer", "SQL");
        System.out.println("developer1 = " + developer1);
        System.out.println("developer1 = " + developer1.calculateBonus());

        Manager manager1 = new Manager("Maria Perez", "Humahuaca 45", 50000, "Department Manager");
        System.out.println("manager1 = " + manager1.performanceReport());

        Programmer programmer1 = new Programmer("Martin", "Crisostomo 78", 650000, "Backend programmer","C++");
        programmer1.debugCode();
    }
}
