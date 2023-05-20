
/*
Write a Java program to create an array (length # 0) of string values. The elements will contain "0", "1", "2" … through ... n-1.
*/

// import java.util.*; 
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First enter the number of strings you want to enter");

        // take an integer input 
        String[] str = new String[sc.nextInt()];
        // consuming the entered strigs from above
        sc.nextLine();

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        System.out.println("\n You enterd: ");
        for (String string : str) {
             System.out.println(string);            
        }

        sc.close();

    }
}


// correction
// import java.util.*; 
// import java.io.*; 
//  public class index {
//  public static void main(String[] args)
//  {
//     int n= 5;
// 	String[] arr_string = new String[n];
	
//     for(int i = 0; i < n; i++)
//         arr_string[i] = String.valueOf(i);                                  
// 	 System.out.println("New Array: "+Arrays.toString(arr_string)); 
// 	 }
// }
