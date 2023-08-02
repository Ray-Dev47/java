/*
An object's encapsulation allows it to hide its data and methods. It is one of the fundamental principles of object-oriented programming. Java classes encapsulate the fields and methods that define an object's state and actions. Encapsulation enables you to write reusable programs. It also enables you to restrict access only to public features of an object. Other fields and methods are private and can be used internally.



Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables.
 */


public class Person {
    private String name;
    private int age;
    private String country;

    // public Person(String name, int age, String country){
    //     this.name = name;
    //     this.country = country;
    //     this.age = age;
    // }

    public String getName(){
        return name;
    }

    public void setName(String name){
         this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }


    
}
