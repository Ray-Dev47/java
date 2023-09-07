/*
 Write a Java program to test if a hash set is empty or not.
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


        if(colorSet.isEmpty()){
          System.out.println("List is empty");
      }else{
          System.out.println("List is not empty");
      }
      // System.out.println(colorSet);  // []
        // System.out.println("hashset size or number of element " + colorSet);
        // for(String n: colorSet){
        //    System.out.println(n);  //
        // }
    }
 }





