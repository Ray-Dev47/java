/*
Write a Java program to update an array element by the given element.
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

        // to insert at the first position
        colors.set(3,"white");
        // Using enhanced for loop to print all for the Collection ArrayList
        for(String n: colors){
           System.out.println(n);  //
        }
    }
 }





