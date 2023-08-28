/*
Write a Java program to search for an element in an array list.
*/

import java.util.List;
import java.util.ArrayList;

public class javaFile {
  public static void main(String[] args)
  {
                 List <String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Black");
        colors.add("Indigo");
        colors.add("Black");
        

        colors.indexOf("Black");  
        System.out.println(colors.indexOf("Black"));// 3
        System.out.println(colors.lastIndexOf("Black"));// 5
        // Using enhanced for loop to print all for the Collection ArrayList
        // for(String n: colors){
        //    System.out.println(n);  //
        // }
    }
 }





