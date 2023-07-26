/*
Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.
*/

import java.time.LocalDate;
// import java.time.LocalDate;
import java.time.Period;

public class Employee{
      private String name;
      private int salary;
      private LocalDate hireDate;

      
      public  Employee(String name, int salary, LocalDate hireDate){
          this.name = name;
          this.salary = salary;
          this.hireDate = hireDate;          
      }

      public String getName(){
          return name;
      }

      public void setName(String name){
           this.name = name;
      }

      public int getSalary(){
           return salary;
      }

      public void setSalary(int salary){
          this.salary = salary;
      }

      public LocalDate getHireDate(){
          return hireDate;
      }

      public void setHireDate(LocalDate hireDate ){
          this.hireDate = hireDate;
      }

      public int getYearofService(){
          return Period.between(hireDate, LocalDate.now()).getYears();
      }

     public void printEmpolyeeDetails(){
         System.out.println("Name of employee: " + name);
         System.out.println("Salary of employee: " + salary);
         System.out.println("year of service of employee: " + hireDate);
     }

      public static void main(String[] args){
          Employee employee1 = new Employee("Raymond", 20000, LocalDate.parse("2023-07-03"));
          Employee employee2 = new Employee("Samuel", 300000, LocalDate.parse("2021-03-15"));
          Employee employee3 = new Employee("Victor", 60000, LocalDate.parse("2020-03-15"));

          employee1.printEmpolyeeDetails();
          System.out.println(employee1.getYearofService());
          employee2.printEmpolyeeDetails();
          System.out.println(employee2.getYearofService());
          employee3.printEmpolyeeDetails();
          System.out.println(employee3.getYearofService());

    }
}