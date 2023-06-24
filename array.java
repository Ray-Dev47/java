/*
 * Write a Java program to remove duplicate elements from a given array and return the updated array length.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program should return 4 as the new length of the array.
 */

// import java.util.Arrays;

public class array {
    public static int removeDuplicates(int array[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;// for next element
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j++] = array[i];
            }
        }
        array[j++] = array[n - 1];
        return j;
    }

    public static void main(String[] args) {
        int array[] = { 18, 18, 25, 25, 25, 28, 28, 29 };
        int length = array.length;
        length = removeDuplicates(array, length);
        // printing array elements
        for (int i = 0; i < length; i++)
            System.out.print(array[i] + " ");
    }
}