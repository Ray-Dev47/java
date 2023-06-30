/*
 * Java Inheritance: In the Java language, classes can be derived from other classes, thereby inheriting fields and methods from those classes.

Definitions: A class that is derived from another class is called a subclass (also a derived class, extended class, or child class). The class from which the subclass is derived is called a superclass (also a base class or a parent class).

Excepting Object, which has no superclass, every class has one and only one direct superclass (single inheritance). In the absence of any other explicit superclass, every class is implicitly a subclass of Object.

Classes can be derived from classes that are derived from classes that are derived from classes, and so on, and ultimately derived from the topmost class, Object. Such a class is said to be descended from all the classes in the inheritance chain stretching back to Object.
 


Task *************
Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
*/

 class inheritance {
    public void makeSound(){
        System.out.println("Cat goes Meow!!");
    }
 }
    class Cat extends inheritance{
         public static void main(String[] args) {
            inheritance myCat = new inheritance();
           myCat.makeSound();
    }
}
   
