/*
Write a Java program to find the longest words in a dictionary.
Example-1:
{
"cat",
"flag",
"green",
"country",
"w3resource"
}
Result: "w3resource"
Example-2:
{
"cat",
"dog",
"red",
"is",
"am"
}
Result: "cat", "dog", "red"
*/

// import java.util.Arrays;

// import java.util.HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class index {
    public static void main(String[] args) {
        List<String> wordsList = Arrays.asList(
            "cat",
            "flag",
            "green",
            "country",
            "w3resource");

int maxLength = Integer.MIN_VALUE;

List<String> largestStrings = new ArrayList<>();
for (String s : wordsList) {
    if (s.length() > maxLength) {
        maxLength = s.length();
        largestStrings.clear();
        largestStrings.add(s);
    } else if (s.length() == maxLength) {
        largestStrings.add(s);
    }
}

if (largestStrings.size() > 1) {
    System.out.println("More than one longest word");
    System.out.println(largestStrings);
} else {
    System.out.println(largestStrings.get(0) + " is the longest word");
}
    }
}