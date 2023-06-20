/*
 * Java program to sort a numeric array and a string array
 */

import java.util.Arrays;

public class array {
    public static void main(String[] args ) {
        int[] arr1 = { 1, 6, 3, 8, 4, 8, 9, 4 };
        String[] arr2 = { "Ray", "Mike", "Ene" };
        System.out.println("Original Array: " + Arrays.toString(arr1));
        Arrays.sort(arr1);

        System.out.println("Sorted integer: " + Arrays.toString(arr1));

        Arrays.sort(arr2);
        System.out.println("Sorted Strings: " + Arrays.toString(arr2));

    }

}
