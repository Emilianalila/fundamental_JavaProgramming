package org.example.chapter8_Strings;
/*Write a method that "adds" spaces to a jumbled string, using (StringBuilder()).
where all words are written together with no spaces.
Each new words begins with a capital letter*/

public class AddSpacesToJumbledString {
    public static void main(String[] args) {
        addSpaces("WednesdayIsGoingToFinishInAnAmazingWay");
    }
    public static void addSpaces(String text){ // this function doesn't return any value only a message in the console
       StringBuilder modifiedText= new StringBuilder(text);//
        for (int i = 0; i < modifiedText.length(); i++) {
            if(i!= 0 && Character.isUpperCase(modifiedText.charAt(i))){//In Java, when you want to use a wrapper class to wrap a primitive type, you will always start with the name of the "wrapper class" corresponding to the primitive data type you want to wrap.
                modifiedText.insert(i, " ");// I can use the method insert, only because I am using a StringBuilder
                i++;//If "i" were not incremented after the space was inserted, the next iteration of the for loop would start at the same position where the space was inserted, resulting in an additional space being inserted before the next capital letter.
            }
        }
        System.out.println(modifiedText);
    }
}
