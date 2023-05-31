
/*
Write a Java program to find the index of a value in a sorted array. If the value does not find return the index where it would be if it were inserted in order.
Example:
[1, 2, 4, 5, 6] 5(target) -> 3(index)
[1, 2, 4, 5, 6] 0(target) -> 0(index)
[1, 2, 4, 5, 6] 7(target) -> 5(index)
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// import java.util.*;
public class index {
    static int[] arr = {1, 2, 4, 5, 6};
public static void main(String[] args) {
        List <Integer> sortedArr = new ArrayList<Integer>();
        
        for(int integer : arr){
            sortedArr.add(integer);
        }

        Collections.sort(sortedArr);
        int index = sortedArr.size() / 2;
        
        // Print median with its index
        System.out.println("Median is: " + sortedArr.get(index) + " at index" + index);
    }
}
