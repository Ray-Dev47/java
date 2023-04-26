// Write a Java program to swap two variables.
public class index {

    public static void main(String args[]){
         int x = 7000 , y = 1000;
         
         System.out.println("Before Swap");
         System.out.println("X is: " + x);  // 7000
         System.out.println("Y is: " + y);  // 1000


         //int temp; //
         int temp = x;
         x = y;
         y = temp;

         System.out.println("After Swap");
         System.out.println("X is: " + x);  // 1000
         System.out.println("Y is: " + y);  // 7000
    }
}
