import java.util.Scanner;
public class PartTimeEmployee1 extends RunEmployee1 {
    private static double rate;
    private static int hour;
    private static double wage1;
    private static double newMonthlyWage1;
    Scanner sc = new Scanner(System.in);
    public void setWage1(int hourWorked, double RatePerHour, double newMonthlyWage) {
        RatePerHour = rate;
        hourWorked = hour;
        double wage1 = RatePerHour * hourWorked;
        this.wage1 = newMonthlyWage;
        newMonthlyWage = sc.nextDouble();
    }
    public double getWage1(double newMonthlyWage) {
        wage1 = newMonthlyWage;
        return wage1 = newMonthlyWage;
    }
    public void writeOutput3(double getWage1) {
        System.out.println("Employee's Part time Monthly Wage is: " + +getWage1());
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        PartTimeEmployee1 em3 = new PartTimeEmployee1();
        System.out.println("You are a Part time Employee!");
        System.out.println("Enter the number of hours you worked in: ");
        hour = sc.nextInt();
        System.out.println("Enter the hourly rate you are working in: ");
        rate = sc.nextDouble();
        wage1 = rate * hour;
        em3.getWage1();
        em3.writeOutput3(wage1);
    }
}
