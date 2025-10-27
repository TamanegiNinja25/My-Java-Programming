import java.util.Scanner;
public class Employee1 extends RunEmployee1 {
    private static String name;
    Scanner sc = new Scanner(System.in);
    public void setName(String newName){
        this.name = newName;
        name = sc.nextLine();
    }
    public String getName(String newName) {
        return name = newName;
    }
    public void writeOutput1(){
        System.out.println("Employee's name is: " +getName());
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Employee1 em1 = new Employee1();
        System.out.println("Enter Employee name: ");
        name = sc.nextLine();
        em1.getName(name);
        em1.writeOutput1();
    }
}
