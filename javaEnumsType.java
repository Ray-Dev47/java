/*
Enums are data type that enables us to store variable in a predefined constants
The variable must be equal to one of the values that have been predefined for it. Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and the days of the week. Because they are constants, the names of an enum type's fields are in uppercase letters


Write a Java program to create an enum called "DaysOfWeek" representing the days of the week.
*/ 


public class javaEnumsType {
    public enum DaysOfWeek{
        MONDAY,
        TUESDAY,
        WEDNESAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
        
    }
    public static void main (String[] args){
        DaysOfWeek today =  DaysOfWeek.MONDAY;
        System.out.println("Today is: " + today);
    }
}
