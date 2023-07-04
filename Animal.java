/*
Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.
*/


public class Animal{
    public void move(){
        System.out.println("Animal moves");
    }
}

 class Cheetah extends Animal{
    @override
    public void move(){
        System.out.println("Cheetah runs");
    }

    public static void main(String[] args) {
       Animal test1 = new Animal();
       Cheetah test2 = new Cheetah();

       test1.move();
       test2.move();
    }

}