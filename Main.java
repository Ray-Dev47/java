public class Main {
  public static void main(String[] args) {
      //  Shape shape = new Shape();
       Shape circle = new Circle(4.0);
       Shape triangle = new Triangle(4.0,5.0);
       Shape rectangle = new Rectangle(4.0,5.0);

        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Area of triangle: " + triangle.calculateArea());
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
       
       
  }
}