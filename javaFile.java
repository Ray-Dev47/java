/*
 Write a Java program that swaps two elements in an array list.
*/

import java.util.List;
import java.util.ArrayList;
// import java.util.Collections;


public class javaFile {
  public static void main(String[] args)
  {
                 List<String> colorSet = new ArrayList<String>();
        colorSet.add("Red");
        colorSet.add("Blue");
        colorSet.add("Orange");
        
        List<String> colorSet2 = new ArrayList<String>();
       colorSet2.add("Black");
        colorSet2.add("Indigo");
        colorSet2.add("Black");

        // for(String n: colorSet){
        //    System.out.println(n);  //
        // }
        colorSet.addAll(colorSet2); 
        System.out.println(colorSet);

    }
 }





