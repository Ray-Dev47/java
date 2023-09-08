/*
Write a Java program to convert a hash set to a treeset.
*/

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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
       
        System.out.println("Hashset " + colorSet);
      
        // Treeset
        Set<String> hashSetToTreeSet = new TreeSet<>(colorSet);

    // Print the TreeSet
       System.out.println("TreeSet: " + hashSetToTreeSet);  // serialized
        // for(String n: colorSet){
        //    System.out.println(n);  //
        // }
    }
 }





