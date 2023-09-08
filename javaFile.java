/*
Write a Java program to convert a hash set to an array.
*/

import java.util.HashSet;

public class javaFile {
  public static void main(String[] args)
  {
        HashSet<String> colorSet = new HashSet<String>();
        colorSet.add("Red");
        colorSet.add("Blue");
        colorSet.add("Orange");
        colorSet.add("Black");
        colorSet.add("Indigo");
        colorSet.add("Black");
       
        System.out.println(colorSet);
        String arr[] = new String[colorSet.size()];
        
        // toArray() method converts the set to array
        colorSet.toArray(arr);
        for(String n: colorSet){
           System.out.println(n);  //
        }
    }
 }





