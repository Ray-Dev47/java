/*
Write a Java program to check if a given string has all distinct characters.
Sample Output: Original String : xyyz
String has all unique characters: false
*/

// import java.util.Arrays;
public class index {
    boolean uniqueChar(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                 if(str.charAt(i) == str.charAt(j)){
                    return false;
                 }
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
       index obj = new index();
       String words = "aeioue";

       if(obj.uniqueChar(words)){
           System.out.println("String: " + words + " has unique characters");
       }else{
        System.out.println("String: " + words + " has duplicate characters");
       }
   }
}