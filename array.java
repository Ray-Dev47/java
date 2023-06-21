/*
 * Write a Java program to remove a specific element from an array.
 */

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int [] arr = {7,5,7,8,4,3};
        int[] newArr = new int[arr.length -1];
        // elememt to be removed
        int j = 4;
        for (int i = 0, k = 0; i < arr.length; i++) {
            if(i != j){
                newArr[k] = arr[i];
                k++;
            }            
        }
        System.out.println("Array before deletion" + Arrays.toString(arr));
        System.out.println("Array after deletion" + Arrays.toString(newArr));
    }
}
