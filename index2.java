/*
Write a Java program that partitions an array of integers into even and odd numbers.

Expected Output

Original array: [7, 2, 4, 1, 3, 5, 6, 8, 2, 10]
After partition the said array becomes: [10, 2, 4, 2, 8, 6, 5, 3, 1, 7]
 */

import java.util.Arrays;

public class index2 {	
  
    public static void main(String[] args) {
          int[] arr = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
          
            System.out.println("Original array: " + Arrays.toString(arr)); 
           int n = arr.length;
         int evenIndex = 0;

    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) {
            int temp = arr[i];
            arr[i] = arr[evenIndex];
            arr[evenIndex] = temp;
            evenIndex++;

        }
    }

    for (int i = 0; i < n; i++) {
        System.out.print( arr[i] + ",");
    }

    // System.out.println("");
 
       }
 
 }

 
