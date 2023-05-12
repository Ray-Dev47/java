
/*
Write a Java program to test if the first and last elements of an array of integers are the same. The array length must be broader than or equal to 2. Go to the editor
Test Data: array = 50, -20, 0, 30, 40, 60, 10
Sample Output:

false
 */
// import java.lang.*;
public class index {
     public static void main(String[] args) {
          int[] nums = { 10, -20, 0, 30, 40, 60, 20 };
          int first = nums[0];
          int last = nums[nums.length - 1];
          System.out.println(first ==  last);
          
     }
}
