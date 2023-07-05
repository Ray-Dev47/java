/*
Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.
*/


public class Person{
    String firstName = "Raymond";
    String lastName = "Idengeli";

     public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
   
     public String getFirstName() {
         return firstName;
     }
     public String getLastName() {
         return lastName;
     }
}

 class Employee extends Person{
       private int employeeId;
       private String jobTitle;
      
       public Employee(String firstName, String lastName, int employeeId, String jobTitle){
            super(firstName, lastName);
            this.employeeId = employeeId;
            this.jobTitle = jobTitle;
       }

       public int getEmployeeId(){
          return employeeId;
       }

    
       @Override
       public String getLastName() {
           return super.getLastName() + " , " + jobTitle;
       }

    public static void main(String[] args) {
          Employee ray = new Employee("Ray", "Lincoln", 7234, "Software Engineer");
          Employee mike = new Employee("Mike", "Idengeli", 34, "Uni Student");
          Employee ene = new Employee("Ene", "Idengeli", 78, "Student");
          System.out.println(ray.firstName);
          System.out.println(mike.employeeId);
          System.out.println(ene.jobTitle);
    }

}