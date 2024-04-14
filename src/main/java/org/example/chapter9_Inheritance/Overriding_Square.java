package org.example.chapter9_Inheritance;
/*
to overriding the method in the superclass,
we recreate, (here in the subclass) a method with the same exact "signature"(name and parameters)
as the one that exists in Overriding_Rectangle (superclass),but changing the body.

Overriding vs Overloading in Java
When the method signature (name and parameters) are the same in the superclass and the child class,
it's called overriding.
When two or more methods in the same class have the "same name" but different parameters,
it's called overloading.
*/
public class Overriding_Square extends Overriding_Rectangle {
    // overriding the method
    @Override // what this does, is let java know, that your intention is to "override" the calculatePerimeter method that you inheritance from the superclass.
    public double calculatePerimeter(){
        return sides * length;
    }
    //When I create an overload method from the superclass, when I call the methods that I have, I will see the ones that inheritance from the superclass and the overload method that I just created
    public void print(String what){// overloading (only different parameters, but same name)
        System.out.println("I am a " + what);
    }

}
