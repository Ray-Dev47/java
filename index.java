
/*
Write a Java program that rotates a string by an offset (rotate from left to right.
*/

public class index {
    public static String rotateStrings(String str1, int offset) {
        char[] arr1 = str1.toCharArray();

        // Adjust the offset to be within the array lengths
        offset %= arr1.length;

        // Rotate the first array
        rotateArray(arr1, offset);

        // Convert the rotated arrays back to strings
        String rotatedStr1 = new String(arr1);

        return rotatedStr1 + " ";
    }

    private static void rotateArray(char[] arr, int offset) {
        reverse(arr, 0, offset - 1);
        reverse(arr, offset, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        int offset = 2;

        String rotatedStrings = rotateStrings(str1, offset);
        System.out.println("Rotated Strings: " + rotatedStrings);
    }
}




