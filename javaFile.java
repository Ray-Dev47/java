/*
Write a Java program to compare two hash set.
*/
import java.util.HashSet;
// import java.util.TreeSet;

public class javaFile {
  public static void main(String[] args)
  {
    
        HashSet<String> colorSet = new HashSet<String>();
        colorSet.add("Red");
        colorSet.add("Blue");
        colorSet.add("Orange");
       
        HashSet<String> colorSet2 = new HashSet<String>();
        colorSet.add("Black");
        colorSet.add("Indigo");
        colorSet.add("Black");
       
        System.out.println("Hashset1 equals Hashset2? " + colorSet.equals(colorSet2));

        // for(String n: colorSet){
        //    System.out.println(n);  //
        // }
    }
 }





