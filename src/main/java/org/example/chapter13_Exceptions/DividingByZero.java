package org.example.chapter13_Exceptions;
/*Your optional exercise for this chapter is to write the following
statement — int c = 30/0 — within a program and execute it*/
public class DividingByZero {
    public static void main(String[] args) {

        try {
            int c = 30/0;
        }catch (ArithmeticException e){
            // Code to handle the exception
            System.out.println("Dividing by zero is not permitted");
        }finally {
            System.out.println("Division is fun!");
        }
    }
    /*public void myMethod() throws MyException { //throw an exception from this method...By throwing a new instance of that exception.
    // Some condition that warrants throwing an exception
    if (condition) {
        throw new MyException("This is my exception message");
        //In this example, MyException is a custom exception class,
        and throw new MyException("This is my exception message") throws an "instance" of MyException with a specific message.
    }
}*/
}
