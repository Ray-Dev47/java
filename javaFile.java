/*
Write a Java program to find a specified element in a given array of elements using Ternary search.

From Wikipedia, a ternary search algorithm is a technique in computer science for finding the minimum or maximum of a unimodal function. A ternary search determines either that the minimum or maximum cannot be in the first third of the domain or that it cannot be in the last third of the domain, then repeats on the remaining two thirds. A ternary search is an example of a divide and conquer algorithm.
*/
import java.util.*;
public class javaFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[]{0,1,2,3,5,7,9,12,15,17,18,21,25,32,52,54,75,89,90,93,97,104,120};
		System.out.println("Original array:");
		System.out.println(Arrays.toString(nums));
    scan.close();
        System.out.println("Input an element to search:");
        int val = scan.nextInt();
        int position = ternary_search(nums, val, 0, nums.length-1);
        if(position == -1)
            System.out.println("\n" +val+ " Element not found");
        else
            System.out.println("\n"+ val +" element found at position "+ position);

    }
    

 static int ternary_search(int[] nums, int val, int first_element, int last_element)
    {
        if(first_element > last_element)
        {
            return -1;
        }
        int mid1_element = first_element + (last_element - first_element) / 3;
        int mid2_element = first_element + 2*(last_element - first_element) / 3;
        if(val == nums[mid1_element])
        {
            return mid1_element;
        }
        else if(val == nums[mid2_element])
        {
            return mid2_element;
        }
        else if(val > nums[mid1_element])
        {
            first_element = mid1_element+1;
        }
        else if(val < nums[mid2_element])
        {
            last_element = mid2_element-1;
        }
        return ternary_search(nums, val, first_element, last_element);
    }
}
