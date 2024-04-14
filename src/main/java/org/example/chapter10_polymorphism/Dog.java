package org.example.chapter10_polymorphism;

public class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("woof");
    }
    //specific method
    public void fetch(){
        System.out.println("fetch is fun!");
    }
}
