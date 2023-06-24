/*
 * Write a Java program to reverse an array of integer values.
 */


import java.util.Arrays;
   

public class array {
    public static void reversedArray(int[] arr){
        //  if arrray is less than 2
        if(arr.length < 2){
            return;
        }
        for (int i=0; i<arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -1  -i];
            arr[arr.length -1  -i] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = {7,5,7,8,4,3}; 

        System.out.println("Original array: " + Arrays.toString(arr));
        reversedArray(arr);
        System.out.println("Reversed "  + Arrays.toString(arr));
    }
}