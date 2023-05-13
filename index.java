
/*
Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7. Go to the editor
Sample Output:

Original Array: [5, 7]                                                 
true 
 */

public class index {
     public static void main(String[] args) {
          int[] arr = { 5, 7 };
          boolean found = false;
          for (int x : arr) {
               if (x == 4 || x == 7) {
                    found = true;
                    break;
               }
          }
          System.out.println(found);
     }
}
