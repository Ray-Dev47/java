/*
Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.
*/

import java.util.ArrayList;

public class Student{
      private String name;
      private int grade;
      private ArrayList < String > courses;

      
      public  Student(String name, int grade){
          this.name = name;
          this.grade = grade;
          this.courses = new ArrayList < String > ();   
              
      }

      public String getName(){
          return name;
      }

      public void setName(String name){
           this.name = name;
      }

      public int getGrade(){
           return grade;
      }

      public ArrayList < String > getCourses() {
        return courses;
      }

    public void addCourse(String course){
        courses.add(course);
    }

    public void removeCourse(String course){
         courses.remove(course);
    }

     public void StudentDetails(){
         System.out.println("Name of student: " + name);
         System.out.println("Grade of student: " + grade);
        //  System.out.println("Courses: " + courses);
     }

      public static void main(String[] args){
            Student student1 = new Student("Raymond", 76);
            Student student2 = new Student("Samuel", 37);
            Student student3 = new Student("Lincoln", 23);
            System.out.println("Student details");
            
            student1.StudentDetails();
            student2.StudentDetails();
            student3.StudentDetails();

            System.out.println("To add course for student 1  " + student1.getName());
            student1.addCourse("Java");
            student1.addCourse("Go");
            student1.addCourse("Python");
            System.out.println(student1.getName() + "'s courses: " + student1.getCourses());

            System.out.println("To add course for student 2  " + student2.getName());
            student2.addCourse("JavaScript");
            student2.addCourse("C++");
            student2.addCourse("C");
            System.out.println(student2.getName() + "'s courses: " + student2.getCourses());

            // to remove "Go" course from student 1
            System.out.println("To remove course Go from student 1 AKA " + student1.getName());
            student1.removeCourse("Go");

            System.err.println("After removal for student1:");
            System.out.println(student1.getCourses());  // [Java, Python]

    }
}