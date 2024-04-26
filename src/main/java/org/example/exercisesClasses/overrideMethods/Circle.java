package org.example.exercisesClasses.overrideMethods;

public class Circle extends Shape {
    private double radius;
    private final double Pi = 3.14; // or just Math.PI
    //
    public Circle (double radio){
        this.radius = radio;
    }
    //
    @Override
    public double getArea() {//πr^2
        return (Math.PI * (radius * radius));// I override this method completely
    }

    @Override
    public double getPerimeter() {// 2πr
        return (2 * Pi * radius);
    }
}
