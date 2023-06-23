/*
 * Write a Java program to find common elements between two integer arrays.
 */

// import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
        int current = arr[0];
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (current == arr[i] && !found) {
                found = true;
            } else if (current != arr[i]) {
                System.out.print(" " + current);
                current = arr[i];
                found = false;
            }
        }
        System.out.print(" " + current);  //  1 3 7 8 9 10
    }
}
