/*
Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
*/

// ideal method
public class employee {
   private int salary;

   public employee(int salary) {
      this.salary = salary;
   }

   public void work() {
      System.out.println("Ray is working as an employee");
   }

   public int getSalary() {
      return salary;
   }
}

class HRManager extends employee {
   public HRManager(int salary) {
      super(salary);

   }

   public void work() {
      System.out.println("\nManaging ray as an employee");
   }

   public void addEmployee() {
      System.out.println("\nAdding new employee");
   }

   public static void main(String[] args) {
      employee emp = new employee(40000);
      HRManager mgr = new HRManager(70000);

      emp.work();
      System.out.println("Employee salary: " + emp.getSalary());

      mgr.work();
      System.out.println("Manager salary: " + mgr.getSalary());
      mgr.addEmployee();
   }

}

// my method
// class employee {
// public void work() {
// System.out.println("Work here");
// }

// public void getSalary(){
// System.out.println("Salary here");
// }

// public void addEmployee() {
// }
// }

// class HREmployee extends employee {
// @Override
// public void work(){
// System.out.println("Work has been overriden");
// }

// public void addEmployee() {
// System.out.println("Ray has been added");
// }

// public static void main(String[] args) {
// employee myWork = new HREmployee();
// myWork.work();
// employee myWork2 = new HREmployee();
// myWork2.addEmployee();
// }
// }

// Shape.java
// Parent class Shape
// public class Shape {
// public double getArea() {
// return 0.0;
// }
// }
// correction
// Rectangle.java
// Child class Rectangle
// public class Rectangle extends Shape {
// private double length;
// private double width;

// public Rectangle(double length, double width) {
// this.length = length;
// this.width = width;
// }
// @Override
// public double getArea() {
// return length * width;
// }
// }
// // Main.java
// // Main class
// public class Main {
// public static void main(String[] args) {
// Rectangle rectangle = new Rectangle(3.0, 10.0);
// double area = rectangle.getArea();
// System.out.println("The area of the rectangle is: " + area);
// }
// }
