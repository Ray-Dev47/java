/*
Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.
*/


public class Shape{
    static double pie = 3.142;
    static int radius = 5;

     public Shape(Double pie, int radius) {
        Shape.pie = 3.142;
        Shape.radius = radius;
    }
   
     public double getPerimeter() {
         return 2*pie*radius;
     }
     public double getArea() {
         return pie * radius * radius;
     }
}

 class Circle extends Shape{    
       public Circle(Double pie, int radius) {
        super(pie, radius);
    }

    @Override
       public double getPerimeter() {
           return 2*pie*radius;
       }

       public double getArea(){
        return pie * radius * radius;
       }

    public static void main(String[] args) {
        // Shape ans1 = new Shape(pie, radius);
        // System.out.println(ans1.getArea());
        // System.out.println(ans1.getPerimeter());
        Shape ans2 = new Circle(pie, radius);
        System.out.println(ans2.getPerimeter());
        System.out.println(ans2.getArea());
    }

}