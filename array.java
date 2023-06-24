/*
 * Write a Java program to test two arrays' equality.
 */

// import java.util.Arrays;

import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        int [] arr = {1,2,4,6};
        int [] arr2 = {1,5,4,6};
        boolean ans = Arrays.equals(arr,arr2);

        if(ans == true){
            System.out.println("equal");
        } else{
            System.out.println("Not Equal");
        }
    }
}
