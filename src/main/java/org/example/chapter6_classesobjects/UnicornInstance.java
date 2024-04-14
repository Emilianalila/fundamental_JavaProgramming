package org.example.chapter6_classesobjects;



public class UnicornInstance {
    public static void main(String[] args) {
        // creating unicorns
        UnicornMold unicorn1 = new UnicornMold("Pepito", "purple", "wrinkled", 78);
        UnicornMold unicorn2 = new UnicornMold("Sancho", "yellow", "enlarge", 78);
        UnicornMold unicorn3 = new UnicornMold("Varela", "brown", "crashes", 78);
        UnicornMold unicorn4 = new UnicornMold("Poncho", "gold", "perk", 78);
        //showing the unicorns without toString() , chapter6_classesobjects.UnicornMold@30f39991 (class name followed by a unique identifier of the object.)
        System.out.println(unicorn1);
        System.out.println(unicorn2);
        System.out.println(unicorn3);
        System.out.println(unicorn4);
        unicorn2.fly();


    }

}
