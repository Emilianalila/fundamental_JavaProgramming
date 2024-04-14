package org.example.chapter6_classesobjects;

public class UnicornMold {
    // "state" or "attributes" (instance variables)
    private int level;
    private String name;
    private String color;
    private String texture;
    private int age;
    // class attribute
    static int levelMagic;
    // public method
    public void fly(){ // if I use a private method, I can access only from inside of this class
        System.out.println("I can fly !!");
    }
    //constructor with access modifier as public (so any class from any package can access to this constructor)
    public UnicornMold (String name, String color, String texture, int age){ // I not call level, because it will be automatic create it by my class attribute
        levelMagic ++;
        this.level= levelMagic;
        this.name = name;
        this.color = color;
        this.texture = texture;
        this.age= age;
    }

    @Override
    public String toString() { // here I CALL level to show it in my console, otherwise I will not see it
        return "Unicorn: [Level: " + level + ", Name: " + name +", Color: " + color + ", Texture: " + texture + ", Age: " + age + "]";
    }

}

