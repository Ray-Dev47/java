//  Write a Java program to find the number of values in a given range divisible by a given value.
/*
For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
Sample Output: 5
 */

import java.util.Scanner;
public class index {

	public static void main(String args[])   {
        Scanner sc = new Scanner(System.in);
             System.out.println("Input first value");
            int x = sc.nextInt();
            System.out.println("Input second value");
            int y = sc.nextInt();
            System.out.println("Input third value");
            int z = sc.nextInt();
        sc.close();
        System.out.println("Ans: " + ans(x, y, z));
        

    }

          static int ans(int a, int b, int c)
          {
          
          if (a % c == 0)
               return (b / c) - (a / c) + 1;
          return (b / c) - (a / c);
          }
      }




