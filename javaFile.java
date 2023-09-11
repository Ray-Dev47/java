/*
Write a Java program to empty an hash set.
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


        colorSet.clear();
        System.out.println("hashset size or number of element " + colorSet);
        // for(String n: colorSet){
        //    System.out.println(n);  //
        // }
    }
 }





