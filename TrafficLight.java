/*
Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.
*/

public class TrafficLight{
      private String color;
      private int duration;
      

      public  TrafficLight(String color, int duration){
           this.color = color;
           this.duration = duration;
      }

      public void changeColor(String newColor){
           color = newColor;
      }

      public boolean isRed(){
          return color.equals("red");
      }

      public boolean isYellow(){
        return color.equals("yellow");
      }

      public boolean isGreen(){
         return color.equals("green");
      }

      public int getDuration(){
         return duration;
      }

      public void setDuration(int duration){
         this.duration = duration;
      }

      public static void main(String[] args){
          TrafficLight obj1 = new TrafficLight("red", 30);

          System.out.println("The light is: "  + obj1.isRed() );
          System.out.println("The duration is: " + obj1.getDuration());

          obj1.changeColor("green");

     System.out.println("The light is now green: " + obj1.isGreen());
     System.out.println("The light duration is: " + obj1.getDuration());
     obj1.setDuration(20);
     System.out.println("The light duration is now: " + obj1.getDuration());
    }
}