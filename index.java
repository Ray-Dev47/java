
/*
Write a Java program to find a number that appears only once in a given array of integers. All numbers occur twice.
Source Array : [10, 20, 10, 20, 30, 40, 40, 30, 50] 50 appears only once
*/


// import java.io.*;
class MaxSum
{
    // Return the maximum Sum of difference
    // between consecutive elements.
    static int findSingle(int ar[], int ar_size)
    {
        // Do XOR of all elements and return
        int res = ar[0];
        for (int i = 1; i < ar_size; i++)
            res = res ^ ar[i];
      
        return res;
    }
  
    // Driver code
    public static void main (String[] args)
    {
        int ar[] = {10, 20, 10, 20, 30, 40, 40, 30, 50};
        int n = ar.length;
        System.out.println("Element occurring once is " +
                            findSingle(ar, n) + " ");
    }
}
