package org.example.chapter10_polymorphism;

public class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("meow");
    }
    //special method to my subclass Cat
    public void scratch (){
        System.out.println("I am a cat. I scratch thing!");
    }
}
