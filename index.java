
/*
Write a Java program to test if the first and last element of two integer arrays are the same. The array length must be greater than or equal to 2. Go to the editor
Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
array2 = 45, 20, 10, 20, 30, 50, 11
Sample Output:

false
 */
// import java.lang.*;
public class index {
     public static void main(String[] args) {
          int[] arr1 = { 50, -20, 0, 30, 40, 60, 70 };
          int[] arr2 = { 40, 20, 10, 20, 30, 50, 45 };
          int firstArr1 = arr1[0];
          int lastArr1 = arr1[arr1.length - 1];
          int firstArr2 = arr2[0];
          int lastArr2 = arr2[arr2.length - 1];

          System.out.println(firstArr1 == lastArr1 &&  firstArr2 == lastArr2);
          
     }
}
