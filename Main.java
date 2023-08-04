public class Main {
  public static void main(String[] args) {
      // Employee employee = new Employee();
      Employee manager = new Manager("Raymond", 45000.0,10000.00);
      Employee programmer = new Programmer("Sam", 100000, 30000);

      System.out.println("Programmer: " +  programmer.getName() + " Salary " + programmer.calculateSalary());
      System.out.println("Manager: " +  manager.getName() + " Salary " + manager.calculateSalary());
  }
}