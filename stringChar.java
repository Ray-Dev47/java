/*
Write a Java program to create a distinct identifier for a given string.

Sample Output:

The hash for Python Exercises. is 863132599 
 */

import java.util.UUID;  

public class stringChar {
   public static void main(String args[]){
    String str = "Raymond Idengeli";

    // Get the hash code for the above string.
    int hash_code = str.hashCode();

    // Display the hash code.
    System.out.println("The hash for " + str +
        " is " + hash_code);
        }
    }
