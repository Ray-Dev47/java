/*
 Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
*/



public class Employee {
     private String job;
     private String title;
     private double salary;

     public  Employee(String job, double salary, String title){
           this.job = job;
           this.salary = salary;
           this.title = title;
     }

     public String getJob(){
               return job;
           }
     
     public void setJob(String job){
          this.job = job;
     }
     public String getTitle(){
          return title;
     }

     public void setTitle(String title){
          this.title = title;
     }
     

     public double getSalary(){
          return salary;
     }

      public void setSalary( int salary){
          this.salary = salary;
     }


     public void increaseSalary(double percentage){
          salary = salary + salary * percentage / 100;
     }

     public void printEployeeDetails(){
          System.out.println("Name: " + job);
          System.out.println("Job title: " + title);
          System.out.println("Salary: " + salary);
     }
  public static void main(String[] args) {
        Employee employee1 = new Employee("Raymond ", 50000, "Software Engineer");
        Employee employee2 = new Employee("Tolani Banjo", 50000, "Software tester");

        employee1.printEployeeDetails();
        employee2.printEployeeDetails();

        employee1.increaseSalary(10);
        employee2.increaseSalary(20);

        System.out.println("Ray's salary after 10% increase from above:");
        employee1.printEployeeDetails();

        System.out.println("Tolani banjo salary after 20% increase from above:");
        employee2.printEployeeDetails();
  }
}
