package org.example.chapter9_Inheritance;

//import chapter6_classesobjects.Rectangle;

/*why do I need inheritance in java?
In Java, inheritance is a vital concept for various reasons:
Inheritance "reduces" code complexity by (minimising code duplication).
If a programmer needs to use the same code to create another class,
the subclass can simply inherit it from the superclass. This also keeps the code more organised.*/
public class InheritanceTester {
    public static void main(String[] args) {
        //Person person1 = new Person();
        //String name = person1.getName();
        Employee employee1 = new Employee(); //calling to the "default" constructor in my subclass
        employee1.getName(); //  I have access to all the properties in class Person, because it was inherited from the Person class
        employee1.setAge(45);
        System.out.println(employee1.getAge());
        // Inheritance in Constructors
        Employee employee2 = new Employee(); //when we create a new instance of the subclass it's going to make a call to the "superclass" {constructor} before it execute the (subclass constructor)! but if we explicitly define these "default" constructor in our "subclass Employee", when I ran this Tester.java it will show in the console first the constructor of the superClass, because it was call first and second the constructor of the subclass

        //Overloading method
        Overriding_Rectangle rectangle = new Overriding_Rectangle();
        rectangle.print();// this show only one method available
        Overriding_Square square = new Overriding_Square();
        square.print("pepita");// this instantiation show two different methods available, the one we inherited and the one we create.


    }

}












/*Herencia (programación orientada a objetos)
La herencia permite a los programadores crear clases que se basan en clases existentes,
 especificar una nueva implementación manteniendo los mismos comportamientos
 (realizando una interfaz),
  reutilizar código y extender de forma independiente el software original a través de clases e interfaces públicas.*/