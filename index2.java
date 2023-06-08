/*
Write a Java program to move every positive number to the right and every negative number to the left of a given array of integers.

Expected Output:
Original array: [-2, 3, 4, -1, -3, 1, 2, -4, 0]
Result: [-4, -3, -2, -1, 0, 1, 2, 3, 4]
 */

import java.util.Arrays;

public class index2 {	
     public static void main(String[] args) {
             int[] arr = {-2, 3, 4, -1, -3, 1, 2, -4, 0}; 
             
                System.out.println("Original Array: " + Arrays.toString(arr) );
                // in ascending order        
                    Arrays.sort(arr);
                    System.out.println("Result: " + Arrays.toString(arr));
          

         }
         
 }
 




