//  Write a Java program to accept an integer and count the factors of the number. 
/*
Sample Output:

Input an integer: 25                                                   
3
 */

import java.util.Scanner;
public class index {

	public static void main(String args[])   {
        Scanner sc = new Scanner(System.in);
             System.out.println("Input Integer");
            int x = sc.nextInt();
            
        sc.close();
        System.out.println("Ans: " + result(x));
    }

        // create function to find the factors of given number.
	public static int result(int num) 
	{	
		int ctr = 0;
		for(int i=1; i<=(int)Math.sqrt(num); i++)
	    {
	        if(num%i==0 && i*i!=num)
	        {
	            ctr+=2;
	        } 
	        else if (i*i==num) 
	        {
	            ctr++;
	        }
	    }
	        return ctr;  
          }
      }




