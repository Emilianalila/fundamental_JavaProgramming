package org.example.chapter8_Strings;
/*Write a method that prints a given string backwards*/

public class PrintStringBackwards {
    public static void main(String[] args) {
        reverseString("What am I doing");
    }
    public static void reverseString(String text){
        /*StringBuilder newText = new StringBuilder(text);
        System.out.println(newText.reverse());*/

        for (int i = text.length() -1; i >= 0; i--) {//
            System.out.print(text.charAt(i)); // I can't use text[I], text is an object, square brackets [] are used to access the elements of an array, not to access the characters of a String object, and we use print only, because we want it to print everything in one line
        }
    }
}
