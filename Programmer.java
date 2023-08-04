
class Programmer extends Employee{
    private double baseSalary;
    private double overtimePay;

    public Programmer(String name, double baseSalary, double overtimePay){
        super(name, "Programmer");
        // super();
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }
       
    @Override
    public double calculateSalary(){
        return baseSalary + overtimePay;
    }
}