package org.example.chapter6_classesobjects;

import java.util.Scanner;

/*the start of this section is the word: "static"
we are going to use different methods witch are not static and see how they behave*/
//we usually use methods that have taken a primitive data type as it's parameters,
// like a string, int or boolean, BUT we can use "object" as the arguments for methods as well
public class HomeAreaCalculatorRedo_start {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //create two instances of the Rectangle class
        HomeAreaCalculatorRedo_start calculator= new HomeAreaCalculatorRedo_start();
        Rectangle kitchen = calculator.getRoom(); // we don't have to import the Rectangle class because is in the same package
        Rectangle bathroom = calculator.getRoom(); // to everything, we have to add our new object "calculator"
        //calculate de area total of this two rooms, this is for I have to call two times to my function getRoom().
        double area = calculator.calculateTotalArea(kitchen, bathroom);//If the method is not static, we can access it using the new object of the same class
        System.out.println(" the total area is: "+ area);
        // el calculator. give me the access to all the non-static methods in this class
        calculator.scanner.close(); // even the scanner have to use the object in order to be used in a static method

    }
    // create the method getRoom() which is going to return an object the rectangle object: which has two properties, first: get the values for our properties second: create the object with my class "Rectangle"
     public Rectangle getRoom(){ //"if we don't want to make this function static, we can't call it  from our static "main" function, therefore we need to create an "object" from the class HomeAreaCalculatorRedo_start"

        System.out.println("Enter the length of your room");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room");
         double width = scanner.nextDouble();
         return new Rectangle(length, width);
    }
     public double calculateTotalArea (Rectangle rectangle1, Rectangle rectangle2){// non-static method which calculate the total area of two rooms
        return rectangle1.calculateArea() + rectangle2.calculateArea();
     }
}
