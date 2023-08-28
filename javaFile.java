/*
Write a Java program to copy one array list into another.
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

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
       
        //copy array list content into another array list
        ArrayList<String> secondArrayList=new ArrayList<>();
        secondArrayList.addAll(colorSet);
        //print all the content of array list
        Iterator<String> colorSet2 = secondArrayList.iterator();
        while (colorSet2.hasNext()) {
            System.out.println(colorSet2.next());
        }



        //method 2 
        /*
         *  List<String> List1 = new ArrayList<String>();
  List1.add("1");
  List1.add("2");
  List1.add("3");
  List1.add("4");
  System.out.println("List1: " + List1);
  List<String> List2 = new ArrayList<String>();
  List2.add("A");
  List2.add("B");
  List2.add("C");
  List2.add("D");
  System.out.println("List2: " + List2);
  // Copy List2 to List1
  Collections.copy(List1, List2);
  System.out.println("Copy List to List2,\nAfter copy:");
  System.out.println("List1: " + List1);
  System.out.println("List2: " + List2);
         */
    }
 }





