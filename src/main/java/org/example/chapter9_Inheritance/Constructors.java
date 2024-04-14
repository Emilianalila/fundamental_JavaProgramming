package org.example.chapter9_Inheritance;
/* super(): rules......
//Superclass constructors run first
//Use "super" to call specific constructor in the "superclass" from one constructor of the subclass's
// Some constructor must be executed

_ if I want to call a second constructor in the superclass,
I use this word "super" and if the second constructor ask for a parameter,
I need to put the parameter here so the superclass know which method I am calling and
 is going to be the one who matches the parameter list.
*/
/*a subclass must provide its own constructor to initialize its state,
 and cannot inherit the constructor of its superclass. However,
 a subclass can call the constructor of its superclass using the "super"
 keyword to initialize the state inherited from the superclass.*/
public class Constructors {
    public Constructors(){// (constructor as a default in my "subclass")
        //super("angi"); // if I am going to make an explicit call to the "super" classes constructor then that call must be the "very first line" of the (subclasses constructor)

        // if I don't have any default constructor in my "superclass" because it explicitly defined another constructor, we will have to make a call to one of the constructor that exist, ej: super()
    }
}
