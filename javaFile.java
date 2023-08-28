/*
Write a Java program to shuffle elements in an array list.
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
       
        Collections.shuffle(colorSet);
        System.out.println(colorSet);

    }
 }





