package org.example.chapter6_classesobjects;

public class Rectangle { // general representation or shell of a rectangle object (MOLD). "OOP" object-oriented programming  THIS CLASS IS NOT STATIC
    private double length; //state "conjuntos de variables de instancia" or fields 'campos' or instance variables "variables de instancia", A good practice is to have this as a "private" and decide later on, give access to the user by implementing setter and getter.
    private double width;
     // how we can set the values in our fields (variables) A_ with setter, getter  and constructor methods:
     //........................default constructor
    // another way for people who want to create rectangle object and set values to our fields. B_ Constructor (we have two, default constructor and ....)
    public Rectangle(){// B_used to do, assign default values to the fields or initialize an object, we don't use the word this here, because we don't have a variable (in the parameter) in this scope call length so is very clear that we are talking about the ones from the class.
        length = 0;
        width = 0;
    }
    // ............C_another Constructor for people who would like to create a rectangle and they actually do know the length in the width well...............
    public Rectangle(double length, double width){
        this.length = length;// alternative options
        setWidth(width);
    }
    //...................................getters and setters
    public double getLength() {
        return length;
    }
    public void setLength(double value) {// take in a parameter and we can name it whatever we want.
        this.length = value; //take the variable that belongs to this class as a memory location and set the value, to the parameter that we are passing in this method.
    }

    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return  width;
    }
    //.......................................public methods to calculate "perimeter and area"
    double calculatePerimeter(){
        return (2* length) + (2* width);
    }
    double calculateArea(){
        return length * width;
    }


    //encapsulation:the key of object-oriented programming and what it say is when you create a class that is going to represent an object
    // then your fields should be private so, what "private" means is that no other code outside of this class can access things that are marked as private,
    // so no class can directly access this length nor can they directly access this width, that is what the getter, setter and constructor are for.
    //so in order to have encapsulation we have to use our fields in "private" and the setter, getter and constructor "public".
    //usually we have our methods in public therefor we can use then outside our package.
}
