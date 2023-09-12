/*
Write a Java program to clone a hash set to another hash set.
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


        HashSet<String>  colorSet2 = (HashSet<String>) colorSet.clone();
       
        System.out.println(colorSet2);
        // for(String n: colorSet){
        //    System.out.println(n);  //
        // }
    }
 }





