/*
Write a Java program to find the kth smallest and largest element in a given array. Elements in the array can be in any order.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
K'th smallest element of the said array:
3
K'th largest element of the said array:
25
 */



public class index2{
    // Driver code
	public static void main(String[] args)
	{
			int[] arr = {1, 4, 17, 7, 25, 3, 100};
            int first = arr[0];
            int last = arr[arr.length - 1];
            System.out.println("smallest element of the said array: " + first);
            System.out.println("largest element of the said array: " + last);
	}
	


}

	




