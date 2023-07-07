/*
All programming languages provide abstractions. It can be argued that the complexity of the problems you’re able to solve is directly related to the kind and quality of abstraction. An essential element of object-oriented programming is an abstraction. For more information read this article.

1. Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.
*/



abstract class Animal{
    abstract void sound();
}

class Lion extends Animal{
    @Override
    void sound(){
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal{
    @Override
    void sound(){
        System.out.println("Tiger rooars with a sprinkle of meow");
    }

    public static void main(String[] args) {
    Animal sound1 = new Lion(); 
    Animal sound2 = new Tiger();
    
    sound1.sound();
    sound2.sound();
}
}

