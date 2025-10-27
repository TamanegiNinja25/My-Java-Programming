import java.util.regex.*;
import java.util.Scanner;
public class Verifier {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your Student Number: ");
    String number = scan.nextLine();
        String regex = "\\d{4}-\\d{2}-\\d{3}";
        Pattern seq = Pattern.compile(regex);
        Matcher match = seq.matcher(number);
    if(match.matches()){
        System.out.println("You have Successfully Logged in!");
        System.out.println("Welcome to your Dash Board!");
        System.out.println("Your Student Number: " +number);
        }
    else{
        System.out.println("Error! Enter a Student Number.");
        }
    }
}
