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
        colorSet.add("Black");
        colorSet.add("Indigo");
        colorSet.add("Black");

        colorSet.clear();
        
        System.out.println("Hashset cleared " + colorSet);

        // for(String n: colorSet){
        //    System.out.println(n);  //
        // }
    }
 }





