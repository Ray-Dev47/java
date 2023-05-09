/*
Write a Java program to insert a word in the middle of another string. Go to the editor
Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python Tutorial 3.0.
Sample Output:

Python Tutorial 3.0
 */

public class index {
     public static void main(String[] args) {
         String stringOne = "Raymond loves apple";
         String stringTwo = "Red ";
         int index = 13;
         
         String result = new String();
         for(int i = 0; i < stringOne.length(); i++){
               result += stringOne.charAt(i);
               if(i == index){
                    result += stringTwo;
               }
         }
         System.out.println("The result is: " + result);
     }
}
