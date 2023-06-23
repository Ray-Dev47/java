/*
 * Write a Java program to find the index of an array element.
 */

// import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int [] nums = {7,4,5,7,8,4,3};
        int targetElement = 8;
        int index = -1;

        int i = 0;
        while(i < nums.length) {
            if(nums[i] == targetElement) {
                index = i;
                break;
            }
            i++;
        }
         
        System.out.println("Index of "+targetElement+" is : "+index);

        
    }
}
