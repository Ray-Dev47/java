
/*
Write a Java program to swap the first and last elements of an array (length must be at least 1) and create another array. Go to the editor
Sample Output:

Original Array: [20, 30, 40]                                           
New array after swaping the first and last elements: [40, 30, 20] 
 */

import java.util.Arrays;

class index {    
     public static void main(String[] args) {    
            //Initialize array     
            int [] arr =  {20, 30, 40};
            System.out.println("The original array is: " + Arrays.toString(arr)); 

            int arrTemp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = arrTemp;
            System.out.println("New array after swaping the first and last elements: " + Arrays.toString(arr));
        }    
    }    
