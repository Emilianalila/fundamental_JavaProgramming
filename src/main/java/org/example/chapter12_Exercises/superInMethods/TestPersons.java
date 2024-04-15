package org.example.chapter12_Exercises.superInMethods;
/*Write a Java program to create a class known as Person with methods called
getFirstName() and getLastName().
Create a subclass called Employee that adds a new method named getEmployeeId()
and overrides the getLastName() method to include the employee's job title.*/

public class TestPersons {
    public static void main(String[] args) {
        Person person1 = new Person("Maria", "Fernandez");
        Employee employee1 = new Employee("Paquita", "Sevilla", 89,"cashier");
        System.out.println("employee1 = " + employee1.getFirstName() +" "+ employee1.getLastName() + " ("+ employee1.getEmployeeId() +")");
        System.out.println("person1 = " + person1.getFirstName() +", " + person1.getLastName());
        System.out.println("employee1 = " + employee1.getLastName());

    }
}
