/*
Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage. Provide public getter and setter methods to access and modify the company_name, model_name, and year variables. However, only provide a getter method for the mileage variable.
 */


class Car {
  private String company_name;
  private String model_name;
  private int year;
  private int mileage;

    public String getCompanyName(){
      return company_name;
    }
    public void setCompanyName(String company_name){
       this.company_name = company_name;
    }
    public String getModelName(){
        return model_name;
    }
    public void setModelName(String model_name){
        this.model_name = model_name;
    }
    public int getyear(){
        return year;
    }
    public void setYear(int year){
       this.year = year;
    }

    public int getMileage(){
       return mileage;
    }
    
}

