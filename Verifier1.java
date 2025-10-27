import java.util.regex.*;
import java.util.Scanner;

public class Verifier1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Student Number: ");
        String number = scan.nextLine();

        String[] parts = number.split("-");
        if (parts.length == 3 && parts[0].matches("\\d{4}") && parts[1].matches("\\d{2}") && parts[2].matches("\\d{3}")) {
            System.out.println("You have Successfully Logged in!");
            System.out.println("Welcome to your Dash Board!");
            System.out.println("Your Student Number: " + number);
        } else {
            System.out.println("Error! Enter a valid Student Number.");
        }
    }
}
