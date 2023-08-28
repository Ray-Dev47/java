/*
Write a Java program to create an array list, add some colors (strings) and print out the collection.
*/

import java.util.List;
import java.util.ArrayList;
// import java.util.List;

public class javaFile {
  public static void main(String[] args)
  {
                 List <String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Black");



        // Using enhanced for loop to print all for the Collection ArrayList
        for(String n: colors){
           System.out.println(n);  // works 
        }
    }
 }





