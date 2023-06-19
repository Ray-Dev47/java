/*
Enums are data type that enables us to store variable in a predefined constants
The variable must be equal to one of the values that have been predefined for it. Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and the days of the week. Because they are constants, the names of an enum type's fields are in uppercase letters

Write a Java program to implement an enum called "Shape" with constants representing different geometric shapes.
*/

public class javaEnumsType {
    public enum Shape {
        SQUARE,
        CIRCLE,
        RECTANGLE,
        TRIANGLE,
        HEXAGON
    }

    public static void main(String[] args) {
        Shape bestShape = Shape.CIRCLE;
        System.out.println("Best shape is: " + bestShape);
    }
}
