//   Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
/*
 */

import java.util.Scanner;
public class index {

	public static void main(String args[])   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Integer");
        int int1 = sc.nextInt();
        System.out.println("Enter the second integer");
        int int2 = sc.nextInt();
        System.out.println("Enter the third integer");
        int int3 = sc.nextInt();

        sc.close();
        if(int1 + int2 == int3 ){
             System.out.println("The result is: True");
        } else{
            System.out.println("The result is: False");
        }
        
    }
        
}



// Method 2 -
// import java.util.*;
//  public class Exercise52 {
//  public static void main(String[] args)
//     {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Input the first number : ");
//         int x = in.nextInt();  
// 		System.out.print("Input the second number: ");
// 		int y = in.nextInt(); 
// 		System.out.print("Input the third number : ");
//         int z = in.nextInt(); 
//         System.out.print("The result is: "+sumoftwo(x, y, z));
// 		System.out.print("\n");
//     }
    
//     public static boolean sumoftwo(int p, int q, int r)
//       {	
//          return ((p + q) == r || (q + r) == p || (r + p) == q);	
// 	   }
// }



