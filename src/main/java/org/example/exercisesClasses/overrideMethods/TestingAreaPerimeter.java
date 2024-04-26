package org.example.exercisesClasses.overrideMethods;

public class TestingAreaPerimeter {
    public static void main(String[] args) {
        Circle circle1 = new Circle(8.0);
        System.out.println("circle1 Area= " + circle1.getArea());
        System.out.println("circle1 Perimeter= " + circle1.getPerimeter());
    }
}
