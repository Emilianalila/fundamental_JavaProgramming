package org.example.chapter5_Methods;

import java.util.Scanner;

public class Greeting {//(all the methods have to be contains within the class and doesn't matter the order)
    public static void main(String [] arg){//if we run a java application it's going to start off in the "main" method, the main method essentially used to control the flow of the program.
        System.out.println("Enter your Name");
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        greetingName(name);// so if you want to execute another method, like greetingName you have to call that method inside this "main" method.
        scanner.close();
    }
    public static void greetingName(String name){// our method's "name" it should start with a verb, telling what we are doing. our parameter can have any name, but we have to specify the type.
        System.out.println("Hello " + name+ ".... What a beautiful name!");
    }

}
