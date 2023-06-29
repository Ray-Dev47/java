/*
Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
*/

class shapeInheritance {
   public int getArea() {
      int a = 0;
      int b = 0;
      return a * b;
   }
}

class Rectangle extends shapeInheritance {
   @Override
   public int getArea() {
      int a = 5;
      int b = 5;
      return a * b;
   }

   public static void main(String[] args) {
      shapeInheritance areaCalc = new Rectangle();
      System.out.println("Area of the rectangle is :" + areaCalc.getArea());
   }
}


// correction
// Rectangle.java
// Child class Rectangle
// public class Rectangle extends Shape {
//     private double length;
//     private double width;
    
//     public Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }
//   @Override
//     public double getArea() {
//         return length * width;
//     }
// }
// // Main.java
// // Main class
// public class Main {
//     public static void main(String[] args) {
//     Rectangle rectangle = new Rectangle(3.0, 10.0);
//     double area = rectangle.getArea();
//     System.out.println("The area of the rectangle is: " + area);
//     }
// }
