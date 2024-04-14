package org.example.chapter6_classesobjects;
//Instantiating objects (creating objects)
/*write a class that creates instances of
the rectangle class to find the total area of 'two' rooms in a house*/
public class HomeAreaCalculator {
    public static void main(String[] args) { //we have here "specific objects" from a "general class"
        //first room: creating an instance of rectangle class using "set" (default)...............................................create two instances of the Rectangle class: (osea, crea dos objetos desde la clase o desde el molde de Rectangle)
        Rectangle room1 = new Rectangle(); // Data type(class name) objectName = new ClassName(); => (calling to the default constructor), inicializo los valores de las propiedades de mi nuevo objeto
        room1.setLength(25); //changing the initialization values from the default constructor, using the setter methods
        room1.setWidth(25);
        System.out.println(room1.getWidth()); // this is the only way, that I can show the value of width.
        double calculateRoom1 = room1.calculateArea();

        //second room: creating an instance of rectangle class using a "constructor", not the default one...........................
        Rectangle room2 = new Rectangle(34,35); //ClassName objectName = new ClassName(parameters list); calling to the constructor who matches with the same parameter list.
        double calculateRoom2 = room2.calculateArea();

        double totalArea = calculateRoom1 + calculateRoom2;
        System.out.println(" total area: " + totalArea);
    }
}
