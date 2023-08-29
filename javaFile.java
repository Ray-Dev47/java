/*
Write a Java program to extract a portion of an array list.
*/

import java.util.List;
import java.util.ArrayList;


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
        System.out.println(colorSet);

        List<String> arrlist2 = colorSet.subList(2, 4);
        System.out.println(arrlist2);   // [Orange, Black]

    }
 }





