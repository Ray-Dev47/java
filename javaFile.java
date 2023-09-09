/*
Write a Java program to add all the elements of a specified tree set to another tree set..
*/

import java.util.Set;
import java.util.TreeSet;

public class javaFile {
  public static void main(String[] args)
  {
    
        Set<String> colorSet = new TreeSet<String>();
        colorSet.add("Red");
        colorSet.add("Blue");
        colorSet.add("Orange");
        colorSet.add("Black");
        colorSet.add("Indigo");
        colorSet.add("Black");
        
        System.out.println(colorSet);

        // for(String n: colorSet){
        //    System.out.println(n);  //
        // }
    }
 }





