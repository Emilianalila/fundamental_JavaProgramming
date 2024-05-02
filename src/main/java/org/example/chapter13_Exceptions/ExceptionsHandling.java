package org.example.chapter13_Exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionsHandling {
    public static void main(String[] args) {
        createNewFile();
    }
    public static void createNewFile(){  //method that create a File
        File file1 = new File("text.txt");// we have to create an object in order to use the File class
        if (file1.exists()){
            System.out.println("the file exists!!");
            System.out.println("Path"+ file1.getAbsolutePath());
        }
        try{
            file1.createNewFile(); // java is going to attempt to run this create a new file, if an exception happens to be thrown, then the catch block will catch it
        }catch(Exception e){// we have to specify which exception we want catch, how do we know the exception we are going to catch? create a new File has the potential of throwing an i/o exception, so we want to catch what it's throwing (e is just the name)
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }
}
