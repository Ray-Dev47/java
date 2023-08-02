/*
 * Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".
 * 
 * An interface is a completely "abstract class" that is used to group related methods with empty bodies:
 */

// import org.w3c.dom.css.Rect;

public interface Shape{
    double calcArea();
}











//  // Interface
// interface Animal {
//   public void animalSound(); // interface method (does not have a body)
//   public void sleep(); // interface method (does not have a body)
// }

// // Pig "implements" the Animal interface
// class Pig implements Animal {
//   public void animalSound() {
//     // The body of animalSound() is provided here
//     System.out.println("The pig says: wee wee");
//   }
//   public void sleep() {
//     // The body of sleep() is provided here
//     System.out.println("Zzz");
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     Pig myPig = new Pig();  // Create a Pig object
//     myPig.animalSound();
//     myPig.sleep();
//   }
// }