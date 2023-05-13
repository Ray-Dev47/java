
/*
Write a Java program to find the largest element between the first, last, and middle values in an array of integers (even length). Go to the editor
Sample Output:

Original Array: [20, 30, 40, 50, 67]                                   
Largest element between first, last, and middle values: 67 
 */

import java.util.Arrays;

class index {    
     public static void main(String[] args) {    
            //Initialize array     
            int[] array_nums = {20, 30, 40, 50, 67};
            System.out.println("Original Array: "+Arrays.toString(array_nums)); 
            int max_val = array_nums[0];
            if(max_val <= array_nums[array_nums.length-1])
                max_val = array_nums[array_nums.length-1];
            if(max_val <= array_nums[array_nums.length/2])
                max_val = array_nums[array_nums.length/2];
            System.out.println("Largest element between first, last, and middle values: "+max_val);
        }    
    }    
