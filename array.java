/*
 * Write a Java program to check if an array of integers is without 0 and -1
 */

// import java.util.Arrays;


public class array {

    public static void main(String[] args) {
        int [] arr = {2,4,6,7,8,9,10,11, -1};
        boolean isContain = true;
         for (int x : arr) {
                // System.out.println(x);
                if(x <= 0 || x < 0){
                    isContain = false;
                    break;
                }
            }
        if(isContain == false){
            System.out.println("Array contains either 0 and -1");
        } 
        else{
            System.out.println("Array does not contains 0 and -1");
        }
    }
}
