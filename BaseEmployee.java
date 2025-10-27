public class BaseEmployee {
    protected String name;
    protected double rate;
    protected int hour;
    public BaseEmployee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
// Additional common methods for Employee
}