/*
Write a Java program to remove all occurrences of a specified value in a given array of integers. Return the updated array length.
Sample Output:
Original array: [1, 4, 6, 7, 6, 2]
The length of the new array is: 4
*/

import java.util.Arrays;
public class index {
     public static int[] removeOccurence(int[] arr, int key){
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != key){
                arr[idx++] = arr[i];
            }        
        }
        return Arrays.copyOf(arr, idx);
     }
    public static void main(String[] args) {
        int array[] = {1, 4, 6, 7, 6, 2};
        int key = 6;
        array = removeOccurence(array, key);
        System.out.println(Arrays.toString(array)); // [1, 4, 7, 2]
    }

}