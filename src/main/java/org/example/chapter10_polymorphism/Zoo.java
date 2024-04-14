package org.example.chapter10_polymorphism;
/*key points:
_An object can have a super class type and a subclass instance
_Access: polymorphic object can only access the methods of their type (not their instance).
casting is required in order to access the method of their instance
_Overridden methods: is a method is overridden by the subclass, the polymorphic object will execute the overridden method at run time
_Instance operator: the instanceof operator is used to determine if an object is an instance of a certain class */

public class Zoo {
    public static void main(String[] args) {
       /* Dog rocki1 = new Dog();
        rocki1.makeSound();
        rocki1.fetch();*/

        //polymorphism
        Animal sasha = new Dog(); // sasha is a "type" Animal but "instantiation" of Dog!!!!
        sasha.makeSound();// woof......because we override the method makeSound in the subclass Dog, that is the one that will be executed...woof

        // real polymorphism (change's sasha type)
        sasha = new Cat();// dog and cat are type Animal, extend from that super class!!, is because we can instantiate sasha as a Cat or a Dog.
        sasha.makeSound();
        feed(sasha); // calling the method feed...

        //because sasha is type of Animal "Animal sasha = new Dog()" and not type of Cat only instantiate, we don't have access to the method scratch, because the scratch method belongs to Cat only....so what do we do? cast...
        //casting .....notice here sasha has been cast to cat type, so this is not changing the overall object "sasha = new Cat();" so sasha is still of type Animal
        ((Cat) sasha).scratch(); // we are saying only in this line, go ahead and make sasha of type Cat just we can execute this method

    }
    // method that belongs to this class Zoo to feed the animal
    public static void feed(Animal ani){ // this class accepts the superclass Animal, that means we can pass in an "animal object" or any "subclass of animal" Cat or Dog
        if (ani instanceof Cat){
            System.out.println("food for Catssss!!.");
        } else if (ani instanceof Dog) {
            System.out.println("food for Dogss!!.");
        }
    }
}
