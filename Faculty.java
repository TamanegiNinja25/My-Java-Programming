public class Faculty extends CollegeList{
    private Boolean status;
    private double salary;
    private String department;
    public void setStatus(Boolean status){
        this.status = status;
    }
    public boolean isRegular(){
        return status;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    public double getSalary(){
        return salary;
    }
    public void displayInfo2(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Faculty Status of Employment: " + (status ? "Regular" : "Non-Regular"));
        department = "General Education";
        System.out.println("Employee's current Department taking: " + department);
        salary = 20000;
        System.out.println("Employee's starting salary: " + salary);
        System.out.println("----------------------------------------------------------------");
    }
}
