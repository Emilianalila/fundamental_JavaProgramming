package org.example.chapter8_Strings;
/*Write a method that counts the number of words
in a string and print them individually on a new line*/

public class CountsNumberOfWords {
    public static void main(String[] args) {
        countWords("You can do it, Emi!");
    }
    public static void countWords(String text){
        String[] arr = text.split(" "); // new array of words, each word is an item of the array
        for(String words: arr){
            System.out.println(words);
        }
        System.out.println("Number of words: "+ arr.length); //my original string "text" doesn't change, because is immutable
        String message = String.format("your text contains %s words", arr.length);//In Java, String.format() is a "function" that allows you to create formatted strings using "format specifiers" == placeholders.
        System.out.println(message);
    }
}


// String[] text2 = "avacado".split("a");