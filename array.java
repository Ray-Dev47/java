/*
 * Write a Java program to copy an array by iterating the array.
 */

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int [] arr = {7,5,7,8,4,3};
        int[] newArr = new int[6];
        
        for (int i = 0; i < arr.length; i++) {
             newArr[i] = arr[i];
        }

        System.out.println("Orginal Array" + Arrays.toString(arr));
        System.out.println("Copied Array" + Arrays.toString(newArr));
    }
}
