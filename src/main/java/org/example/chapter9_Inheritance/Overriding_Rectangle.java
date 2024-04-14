package org.example.chapter9_Inheritance;
//overriding
/*When a subclass may want to change the functionality of a method that it inherited,
 this is allowed by overriding the "inherited method".
*/
public class Overriding_Rectangle {
    protected double length;// when I change my field from protected to private here,
    // I am going to have "access problems" in the subclass where I am using 'this field',
    // for example: in Square, I am overriding a method from this class and using this field to build the body of my subclass method
    // which I don't have access anymore, therefor I have an error!!
    protected double width;
    protected double sides = 4;

    //getter and setters
    public double getSides() {
        return sides;
    }
    public void setSides(double sides) {
        this.sides = sides;
    }
    public double getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    // another method to calculate the perimeter
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }
    public void print(){
        System.out.println("I am a rectangle");
    }
}
