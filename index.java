
/*
Write a Java program to create an array of length 2 from two integer arrays with three elements. The newly created array will contain the first and last elements from the two arrays. Go to the editor
Test Data: array1 = 50, -20, 0
array2 = 5, -50, 10
Sample Output:

Array1: [50, -20, 0]                                                   
Array2: [5, -50, 10]                                                   
New Array: [50, 10]
 */
// import java.lang.*;

import java.util.Arrays;

public class index {
     public static void main(String[] args) {
          int[] arr1 = { 50, -20, 0 };
          int[] arr2 = { 5, -50, 10 };
          int firstArr1 = arr1[0];
          int lastArr2 = arr2[arr2.length - 1];
          
          int [] newArray = new int[2]; 
          newArray[0] = firstArr1;
          newArray[1] = lastArr2;

          System.out.println("Array1: " + Arrays.toString(arr1) );
          System.out.println("Array2: " + Arrays.toString(arr2) );
          System.out.println("New Array: " + Arrays.toString(newArray) );
          
     }
}
