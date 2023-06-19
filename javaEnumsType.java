/*
Enums are data type that enables us to store variable in a predefined constants
The variable must be equal to one of the values that have been predefined for it. Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and the days of the week. Because they are constants, the names of an enum type's fields are in uppercase letters

Task 502
Write a Java program to create an enum called "Weekend" with constants representing the days of the weekend.
conflict fixed
*/ 


public class javaEnumsType {
    public enum Weekend{
        SATURDAY,
        SUNDAY
        
    }
    public static void main (String[] args){
        Weekend bestWeekend =  Weekend.SUNDAY;
        System.out.println("Best weekend is: " + bestWeekend);
    }
}
