/*
 * Write a Java program to convert an array to an ArrayList.
 */

// import java.util.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array {

    public static void main(String[] args) {
        String[] arr = {"Raymond", "Faith", "Micheal", "Samuel"};
        // int i, j;
       List<String> allArr = new ArrayList<String>(Arrays.asList(arr));
       System.out.println(allArr);
    }
}
