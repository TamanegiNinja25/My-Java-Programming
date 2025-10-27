import java.util.Scanner;

public class RunBloodData {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("Enter blood type of patient: ");
        String input1 = scan.next();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("Enter the Rhesus factor: ");
        String input2 = scan.next();
        System.out.println("-------------------------------------------------------------------------------");
        BloodData bd;
        if (input1.equalsIgnoreCase(".") || input2.equalsIgnoreCase(".")) {
            bd = new BloodData();
        } else {
            bd = new BloodData(input1, input2);
        }
        bd.display();
    }
}
class BloodData{
    static String bloodType;
    static String rhFactor;
    public BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }
    public BloodData(String bt, String rh){
        bloodType = bt;
        rhFactor = rh;
    }
    public void display(){
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Patient's Blood Type is: " + bloodType + rhFactor + " and is added to the bank.");
        System.out.println("-------------------------------------------------------------------------------");
    }
}

