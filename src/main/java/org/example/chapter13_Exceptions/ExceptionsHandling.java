package org.example.chapter13_Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsHandling {
    public static void main(String[] args) {
        createNewFile();
        numbersExceptionHandling();
       // createNewFileRethrow(); // when we call this method inside another method,we see the error that we didn't handle before in the body of the actual method, so o either we rethrow the exception or we handle here with a try and catch
    }
    /*"Statements" that could possibly throw an exception go inside a block of try/catch         .....................................*/
    public static void createNewFile(){  //method that create a File, we have to use, try and catch because this type of creation File, gives an error
        File file1 = new File("text.txt");// we have to create an object in order to use the File class
        if (file1.exists()){ // checking if the file exist
            System.out.println("the file exists!!");
            System.out.println("Path"+ file1.getAbsolutePath());
        }
        try{
            // Code that might throw an exception
            file1.createNewFile(); // java is going to attempt to run this create a new file, if an exception happens to be thrown, then the catch block will catch it
        }catch(Exception e){// we have to specify which exception we want catch, how do we know the exception we are going to catch? create a new File has the potential of throwing an i/o exception(Unhandled exception: java.io.FileNotFoundException), so we want to catch what it's throwing (e is just the name)
            // Code to handle the exception
            System.out.println("Directory does not exist.");

           /* e.printStackTrace();
            e.printStackTrace();*/

        }
    }

    public static void numbersExceptionHandling(){
        File file2 = new File("numbers.txt"); // new file object , then I want to reed from that file, with scanner
        Scanner fileReader= null;
        try {
            // Code that might throw an exception
            fileReader = new Scanner(file2); // Scanner object, help us to reed from the console or in this case from the file2 we just created, so instead of "system.in", we use file2, and we put this line inside a try and catch, to handling the exception not found (Unhandled exception: java.io.FileNotFoundException)
            while(fileReader.hasNext()){
               double num= fileReader.nextDouble(); // everything that the scanner reeds, we are going to save in this variable
                System.out.println("num = " + num);
            }
        }catch(FileNotFoundException | InputMismatchException e){ // we are going to catch either this two exceptions
            // Code to handle the exception
            e.printStackTrace();
        } catch (Exception e){ // this branch is going to catch any exception we get lost
            e.printStackTrace();
        }finally {// A finally block in Java is executed regardless of whether an exception is thrown or caught. It provides a way to ensure that certain code is always executed,
            fileReader.close();
        }
    }
  /*  public static void numbersExceptionHandling(){
        File file2 = new File("numbers.txt");
        try (Scanner fileReader = new Scanner(file2)){ // another way to write Scanner, we don't need to close Scanner with the branch finally{}, because java do that for us when we wrote inside the try
            while(fileReader.hasNext()){
                double num= fileReader.nextDouble();
                System.out.println("num = " + num);
            }
        }catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }
    }*/

    public static void createNewFileRethrow() throws Exception{
      File file2 = new File("numbers.txt");
      file2.createNewFile();//
  }
}


/*The code inside a catch block is executed only if an exception of the type or
 subtype specified is thrown. When an exception occurs within the corresponding
 try block, the Java runtime searches for a matching catch block, starting from
 the top and going down until a matching one is found. Once a matching catch block
is found, its code is executed, and then the program continues with the code after the try-catch structure.*/
