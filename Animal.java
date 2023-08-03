/*
In Core, Java Polymorphism is one of easy concept to understand. Polymorphism definition is that Poly means many and morphos means forms. It describes the feature of languages that allows the same word or symbol to be interpreted correctly in different situations based on the context. There are two types of Polymorphism available in Java. For example, in English, the verb “run” means different things if you use it with “a footrace,” a “business,” or “a computer.” You understand the meaning of “run” based on the other words used with it. Check out this article for more information.

Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.
 */


class Animal{
     public void sound(){
        System.out.println("Animal sound here");
     }
    }
     class Bird extends Animal{
         public void sound(){
           System.out.println("Bird makes a chirping sound");
         }
     }

     class Cat extends Animal{
         public void sound(){
           System.out.println("Cat makes a meow sound");
         }
     }



