/*
Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.
*/

 public class Circle {
     private double radius;
     

     public Circle(double radius){
          this.radius = radius;
     }

     public double getArea(){
         return radius * radius * Math.PI;
     }

     public double getPerimeter(){
          return 2*(Math.PI * radius);
     }

  public static void main(String[] args) {
        Circle area = new Circle(5);
        Circle perimeter = new Circle(5);
        System.out.println(area.getArea());
        System.out.println(perimeter.getPerimeter());
  }
}
