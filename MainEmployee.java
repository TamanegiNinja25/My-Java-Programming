import java.util.Scanner;

public class MainEmployee {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee name: ");
        String name = sc.nextLine();
        System.out.println("Type F for Full time or P for Part time: ");
        System.out.println("Use Capital Letter only!");
        char position = sc.next().charAt(0);
        BaseEmployee employee = null;

        switch(position) {
            case 'F':
                System.out.println("You are a Full time Employee!");
                System.out.println("Enter your Monthly Wage: ");
                double salary = sc.nextDouble();
                employee = new BaseFullTimeEmployee(name, salary);
                break;
            case 'P':
                System.out.println("You are a Part time Employee!");
                System.out.println("Enter the number of hours you worked in: ");
                int hour = sc.nextInt();
                System.out.println("Enter the hourly rate you are working in: ");
                double rate = sc.nextDouble();
                employee = new BasePartTimeEmployee(name, hour, rate);
                break;
            default :
                System.out.println("You are not an Employee!");
                System.exit(0);
        }
        if (employee instanceof BaseFullTimeEmployee) {
            ((BaseFullTimeEmployee) employee).writeOutput();
        } else if (employee instanceof BasePartTimeEmployee) {
            ((BasePartTimeEmployee) employee).writeOutput();
        }
    }
}