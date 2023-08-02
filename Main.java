
public class Main {
  public static void main(String[] args) {
      //  Shape obj1 = new Circle(34);
      //   Shape obj2 = new Triangle(3, 5);
      //  Shape obj3 = new Rectangle(3, 4);

      //  obj1.calcArea();
      //  obj2.calcArea();
      //  obj3.calcArea();


      Rectangle rectangle = new Rectangle(10, 12);
		//radius=3
        Circle circle = new Circle(3);
        //base=4,height=6
		Triangle triangle = new Triangle(4, 6);

        System.out.println("Area of the Rectangle: " + rectangle.calcArea());
        System.out.println("Area of the Circle: " + circle.calcArea());
        System.out.println("Area of the Triangle: " + triangle.calcArea());
   }
}