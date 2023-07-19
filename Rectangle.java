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

    //  public String getPerimeter(){
    //       return breed;
    //  }

  public static void main(String[] args) {
      Rectangle rec = new Rectangle(2, 5);
      System.out.println(rec.getArea());
  }
}
