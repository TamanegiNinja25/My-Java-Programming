import java.util.Scanner;
public class FullTimeEmployee1 extends RunEmployee1{
    private static double salary;
    private static double newMonthlySalary;
    Scanner sc = new Scanner(System.in);
    public void setMonthlySalary(double newMonthlySalary){
        this.salary = newMonthlySalary;
        newMonthlySalary = sc.nextDouble();
    }
    public double getMonthlySalary(double newMonthlySalary){
        salary = newMonthlySalary;
        return salary = newMonthlySalary;
    }
    public void writeOutput2(double getMonthlySalary){
        System.out.println("Employee's Full time Monthly Salary is: " +getMonthlySalary());
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        FullTimeEmployee1 em2 = new FullTimeEmployee1();
        System.out.println("You are a Full time Employee!");
        System.out.println("Enter your Monthly Wage: ");
        salary = sc.nextDouble();
        em2.getMonthlySalary();
        em2.writeOutput2(salary);
    }
}
