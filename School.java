/*
 * Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes.
 */

import java.util.ArrayList;

class School{
       private ArrayList < String > students;
       private ArrayList < String > teachers;
       private ArrayList < String > classes;


       public School(){
        this.students = new ArrayList < String > ();
        this.teachers = new ArrayList < String > ();
        this.classes = new ArrayList < String > ();
 }

        public ArrayList < String > getStudents() {
            return students;
        }

        public void addStudent(String student) {
            students.add(student);
          }
        
          public void removeStudent(String student) {
              students.remove(student);
          }

        public ArrayList < String > getTeachers() {
            return teachers;
        }

        public void addTeachers(String teacher) {
              teachers.add(teacher);
          }
        
          public void removeTeacher(String teacher) {
              teachers.remove(teacher);
          }

        public ArrayList < String > getClasses() {
            return classes;
        }

        public void addClasses(String singleClass) {
              classes.add(singleClass);
          }
        
          public void removeClasses(String singleClass) {
              classes.remove(singleClass);
          }

      
          public static void main(String[] args) {
               School sch1 = new School();

               sch1.addStudent("Raymond");
               sch1.addStudent("Samuel");
               sch1.addStudent("buzo");

               sch1.addTeachers("Benjamin");
               sch1.addTeachers("Rufus");

               sch1.addClasses("CHM101");

               System.out.println("Student: " + sch1.getStudents());

            //remove Student ray
            sch1.removeStudent("buzo");
            System.out.println("After removal of buzo");
            System.out.println("Student: " + sch1.getStudents());




          }


  }