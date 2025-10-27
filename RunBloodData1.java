import java.util.Scanner;

public class RunBloodData1 {
    class BloodData1{
        private String bloodType;
        private String rhFactor;
        public void setBloodType(String bloodType){
            this.bloodType = bloodType;
        }
        public void setRhFactor(String rhFactor){
            this.rhFactor = rhFactor;
        }
        public String getBloodType(){
            return bloodType;
        }
        public String getRhFactor(){
            return rhFactor;
        }
        public void display(){
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Patient's Blood Type is: " + bloodType + rhFactor + " and is added to the bank.");
            System.out.println("-------------------------------------------------------------------------------");
        }
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("Enter blood type of patient: ");
        String bloodType = scan.next();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("Enter the Rhesus factor: ");
        String rhFactor = scan.next();
        System.out.println("-------------------------------------------------------------------------------");
        RunBloodData1 bd = new RunBloodData1();
        BloodData1 bd1 = bd.new BloodData1();
        if (bloodType.equals(".") || rhFactor.equals(".")) {
            bd1.setBloodType("O");
            bd1.setRhFactor("+");
        } else {
            bd1.setBloodType(bloodType);
            bd1.setRhFactor(rhFactor);
        }
        bd1.display();
    }
}


