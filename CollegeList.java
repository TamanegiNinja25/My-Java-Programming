import java.util.Scanner;
public class CollegeList {
    public static void main(String[]args){
        String choice;
        String fchoice;
        Scanner scan = new Scanner(System.in);
        Person per = new Person();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Welcome to STI College University!");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Enter your Full Given Name: ");
        String name = scan. nextLine();
        System.out.println("Enter your contact number: ");
        String contactNum = scan.nextLine();
        per.setName(name);
        per.setContactNum(contactNum);
        per.displayInfo();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Select your Status in the University.");
        System.out.println("Press 'E' if an Employee");
        System.out.println("Press 'F' if a Faculty Member");
        System.out.println("Press 'S' if a Student currently studying in school");
        System.out.println("Enter your letter of choice: ");
        choice = scan.nextLine();
        switch (choice){
            case "E":
                System.out.println("----------------------------------------------------------------");
                System.out.println("You are an Employee working in School.");
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter your Department: ");
                String department = scan.nextLine();
                System.out.println("Enter your Salary: ");
                double salary = scan.nextDouble();
                System.out.println("----------------------------------------------------------------");
                Employee emp = new Employee();
                per.displayInfo();
                emp.setDepartment(department);
                emp.setSalary(salary);
                emp.displayInfo3();
                System.out.println("----------------------------------------------------------------");
                break;
            case "F":
                System.out.println("----------------------------------------------------------------");
                System.out.println("You are a Faculty Member.");
                System.out.println("----------------------------------------------------------------");
                System.out.println("Press 'Y' if you are a Regular Faculty");
                System.out.println("Press 'N' if you are not");
                System.out.println("Enter your letter of choice:" );
                fchoice = scan.next();
                if(fchoice.equals("Y")){ //return true
                    System.out.println("----------------------------------------------------------------");
                    Faculty fac = new Faculty();
                    fac.setStatus(true);
                    System.out.println("You are a Faculty Member!" );
                    System.out.println("----------------------------------------------------------------");
                    per.displayInfo();
                    fac.displayInfo2();
                    System.out.println("----------------------------------------------------------------");
                }
                else if (fchoice.equals("N")){
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("You are not a Faculty Member but an Employee");
                    System.out.println("----------------------------------------------------------------");
                }
                else {
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Error Wrong Choice!");
                    System.out.println("----------------------------------------------------------------");
                }
                break;
            case "S":
                System.out.println("----------------------------------------------------------------");
                System.out.println("You are a Student.");
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter the Program you are taking in: ");
                String program = scan.nextLine();
                System.out.println("Enter your current year level: ");
                int yearLevel = scan.nextInt();
                Student stud = new Student();
                per.displayInfo();
                stud.setProgram(program);
                stud.setYearLevel(yearLevel);
                stud.displayInfo1();
                System.out.println("----------------------------------------------------------------");
                break;
            default:
                System.out.println("----------------------------------------------------------------");
                System.out.println("Invalid Input!");
                System.out.println("Please Try Again!");
                System.out.println("----------------------------------------------------------------");
                break;
        }
    }
}
