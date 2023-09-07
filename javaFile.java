/*
Write a Java program to get the number of elements in a hash set.
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
        
        System.out.println("hashset size or number of element " + colorSet.size());
        // for(String n: colorSet){
        //    System.out.println(n);  //
        // }
    }
 }





