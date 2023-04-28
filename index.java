// Write a Java program to convert a decimal number to binary number.

import java.util.Scanner;

public class index {

    public static void main(String args[]) {
        System.out.println("Welcome to Java Program to convert from decimal to binary");
        Scanner scan = new Scanner(System.in);
        int number = Integer.MAX_VALUE;

        while (number != 0) {
            System.out.println(" Please Input deciaml Number");
            number = scan.nextInt();

            // combined conversion and print part into one method
            convert(number);

        }
        scan.close();

    }

    public static byte[] toBinary(int number) {
        byte[] binary = new byte[32];
        int index = 0;
        int copyOfInput = number;
        while (copyOfInput > 0) {
            binary[index++] = (byte) (copyOfInput % 2);
            copyOfInput = copyOfInput / 2;
        }
        return binary;
    }

    /* * Print number in binary format */ public static void printBinary(byte[] binary) {
        for (int i = binary.length - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    /* * Combination of previous two method to convert and print binary numbers */
    public static void convert(
            int input) {
        int copyOfInput = input;
        StringBuilder sb = new StringBuilder();
        while (copyOfInput > 0) {
            byte bit = (byte) (copyOfInput % 2);
            sb.append(bit);
            copyOfInput = copyOfInput / 2;
        }
        System.out.printf("\nDecimal number %d in Binary format is %s %n", input, sb.toString());
    }

}
