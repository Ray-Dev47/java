/*
Write a Java program to find the k smallest elements in a given array. Elements in the array can be in any order.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
3 largest elements of the said array are:
4,3,1
 */


// Java program to find the first, second
// and third minimum element in an array
// import java.util.*;

public class index2
{
	static void Print3Smallest(int array[], int n)
	{
			int firstmin = Integer.MAX_VALUE;
			int secmin = Integer.MAX_VALUE;
			int thirdmin = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++)
			{
				/* Check if current element is less than
				firstmin, then update first, second and
				third */
				if (array[i] < firstmin)
				{
					thirdmin = secmin;
					secmin = firstmin;
					firstmin = array[i];
				}
		
				/* Check if current element is less than
				secmin then update second and third */
				else if (array[i] < secmin)
				{
					thirdmin = secmin;
					secmin = array[i];
				}
		
				/* Check if current element is less than
				then update third */
				else if (array[i] < thirdmin)
					thirdmin = array[i];
			}
		
			System.out.println("3 largest elements of the said array are: " + firstmin + " " + secmin + " " + thirdmin );
			
	}
	
	// Driver code
	public static void main(String[] args)
	{
			int array[] = {4, 9, 1, 32, 12};
			int n = array.length;
			Print3Smallest(array, n);
	}
	
}




