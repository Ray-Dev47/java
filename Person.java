/*
Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
*/

 public class Person {
     private int age;
     private  String name;

     public Person(int age, String name){
          this.age = age;
          this.name = name; 
     }

     public String getName(){
         return name;
     }

     public int getAge(){
          return age;
     }

  public static void main(String[] args) {
      Person person1 = new Person(25, "Ray");
      Person person2 = new Person(53, "Sam");
      System.out.println("My name is " + person1.getName() + " i am " + person1.getAge());
      System.out.println("My name is " + person2.getName() + " i am " + person2.getAge());
  }
}
