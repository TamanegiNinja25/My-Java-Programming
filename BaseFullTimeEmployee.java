public class BaseFullTimeEmployee extends BaseEmployee {
    private double salary;
    public BaseFullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    public double getMonthlySalary() {
        return salary;
    }
    public void writeOutput() {
        System.out.println("Employee's Full time Monthly Salary is: " + salary);
    }
}