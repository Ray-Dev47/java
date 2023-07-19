/*
Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.
*/

 public class Rectangle {
     private int length;
     private int breadth;

     public Rectangle(int length, int breadth){
          this.length = length;
          this.breadth = breadth; 
     }

     public int getArea(){
         return length * breadth;
     }

     public int getPerimeter(){
          return 2*(length * breadth);
     }

  public static void main(String[] args) {
      Rectangle area = new Rectangle(2, 5);
      System.out.println(area.getArea());
      Rectangle perimeter = new Rectangle(2, 4);
      System.out.println(perimeter.getPerimeter());
  }
}
