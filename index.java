
/*
Write a Java program starting with an integer n, divide it by 2 if it is even, or multiply it by 3 and add 1 if it is odd. Repeat the process until n = 1.
// */

import java.util.Scanner;

class index {    
     public static void main(String[] args) {    
            //Initialize array     
          Scanner sc = new Scanner(System.in);
          System.out.println("Please input integer");
          int n = sc.nextInt();

          while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;				
			}
			else {
				n = (3 * n + 1) / 2;				
			}
		}
          sc.close();
          System.out.println(n);
        }    
    }    
