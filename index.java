
/*
Write a Java program to test if 10 appears as the first or last element of an array of integers. The array length must be broader than or equal to 2. Go to the editor
Sample Output:
Test Data: array = 10, -20, 0, 30, 40, 60, 20

true
 */
// import java.lang.*;
public class index {
     public static void main(String[] args) {
          int[] nums = { 10, -20, 0, 30, 40, 60, 10 };

          int first = nums[0];
          int last = nums[nums.length - 1];
          System.out.println(first == 10 && last == 10);
          
     }
}
