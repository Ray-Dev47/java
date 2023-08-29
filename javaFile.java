/*
 Write a Java program that swaps two elements in an array list.
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class javaFile {
  public static void main(String[] args)
  {
                 List<String> colorSet = new ArrayList<String>();
        colorSet.add("Red");
        colorSet.add("Blue");
        colorSet.add("Orange");
        colorSet.add("Black");
        colorSet.add("Indigo");
        colorSet.add("Black");
        

        // for(String n: colorSet){
        //    System.out.println(n);  //
        // }
        Collections.swap(colorSet, 2, 4); 
        System.out.println(colorSet);

    }
 }





