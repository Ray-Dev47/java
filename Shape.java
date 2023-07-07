/*
Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.
*/



abstract class Shape{
    public double calculateArea(){
        return 0.0;
    }

    public double calculatePerimeter(){
        return 0.0;
    }
}

 class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter(){
        return 2*Math.PI * radius;
    }


    

    public class Main {
    public static void main(String[] args) {
        double r = 8.0;
    Shape c1 = new Circle(r);
    System.out.println("Radius of the circle="+r);
    System.out.println("Perimeter: " + c1.calculatePerimeter());
    System.out.println("Area: " + c1.calculateArea());
    }
}

}



