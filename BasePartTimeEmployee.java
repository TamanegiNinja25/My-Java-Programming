public class BasePartTimeEmployee extends BaseEmployee {
    private double wage;
    public BasePartTimeEmployee(String name, int hour, double rate) {
        super(name);
        this.hour = hour;
        this.rate = rate;
        this.wage = hour * rate;
    }
    public double getWage() {
        return wage;
    }
    public void writeOutput() {
        System.out.println("Employee's Part time Monthly Wage is: " + wage);
    }
}