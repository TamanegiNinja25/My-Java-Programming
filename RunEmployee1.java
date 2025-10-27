import java.util.Scanner;
public class RunEmployee1 {
    private static String name;
    private static double rate;
    private static int hour;
    private static double wage1;
    private static double salary;
    public String getName(){
        return name;
    }
    public double getMonthlySalary(){
        return salary;
    }
    public double getWage1(){
        return wage1;
    }
    public static void main(String[]args){
        char position;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee name: ");
        name = sc.nextLine();
        System.out.println("Type F for Full time or P for Part time: ");
        System.out.println("Use Capital Letter only!");
        position = sc.next().charAt(0);
        switch(position){
            case 'F':
                System.out.println("You are a Full time Employee!");
                System.out.println("Enter your Monthly Wage: ");
                salary = sc.nextDouble();
                break;
            case 'P':
                System.out.println("You are a Part time Employee!");
                System.out.println("Enter the number of hours you worked in: ");
                hour = sc.nextInt();
                System.out.println("Enter the hourly rate you are working in: ");
                rate = sc.nextDouble();
                break;
            default :
                System.out.println("You are not an Employee!");
        }
        Employee1 em1 = new Employee1();
        FullTimeEmployee1 em2 = new FullTimeEmployee1();
        PartTimeEmployee1 em3 = new PartTimeEmployee1();
        em1.getName();
        em1.writeOutput1();
        em2.getMonthlySalary();
        em2.writeOutput2(salary);
        em3.getWage1();
        em3.writeOutput3(wage1);
    }
}
