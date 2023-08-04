public class Main {
  public static void main(String[] args) {
      Shape circle = new Circle(45.6);
      Shape triangle = new Triangle(1.0,2.0,3.0);
      Shape rectangle = new Rectangle(2.0,3.0);

      System.out.println("Circle area: " + circle.getArea() + " Perimeter " + circle.getPerimeter());
      System.out.println("Triangle area: " + triangle.getArea() + " Perimeter " + triangle.getPerimeter());
      System.out.println("Rectangle area: " + rectangle.getArea() + " Perimeter " + rectangle.getPerimeter());
  }
}