public class Main {
  public static void main(String[] args) {

       Circle circle = new Circle();
       circle.setRadius(5);
       
       int radius = circle.getRadius();

       System.out.println("Area: " + circle.calcArea(radius));
       System.out.println("Rectangle: " + circle.calcPerimeter(radius));
       
    
  }
}