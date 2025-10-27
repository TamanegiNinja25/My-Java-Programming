import java.util.Scanner;
import java.nio.file.*;
import java.io.IOException;
public class UserAuthentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "C:\\Users\\稲村カルロ\\IdeaProjects\\Task Performance\\src\\records.txt";
        Path file = Paths.get(filename.toString());
        String username;
        String password;
        int choice = 0;
        while (choice != 3) {
            System.out.println("Select the number you wish to Execute:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. You Died!");
            }
        }
    }
    public static void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Must ONLY CONTAIN LETTERS AND NUMBERS!");
        System.out.println("Enter your Username: ");
        String username = sc.next();
        System.out.println("Must ONLY CONTAIN LETTERS AND NUMBERS!");
        System.out.println("Enter your Password: ");
        String password = sc.next();
        if (!username.matches("^[a-zA-Z0-9]+$") || !password.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("Error: Username and password must only contain letters and numbers only!");
            return;
        }
        try {
            Files.write(Paths.get("C:\\Users\\稲村カルロ\\IdeaProjects\\Task Performance\\src\\records.txt"), (username + ":" + password + "\n").getBytes(), StandardOpenOption.APPEND);
            System.out.println("Registration successful.");
        } catch (IOException ioe) {
            System.out.println("An error occurred while registering credentials.");
        }
    }
    public static void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Username: ");
        String user = sc.next();
        System.out.println("Enter your Password: ");
        String pass = sc.next();
        try {
            String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\稲村カルロ\\IdeaProjects\\Task Performance\\src\\records.txt")));
            String[] lines = content.split("\n");
            for (String line : lines) {
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].equals(user) && parts[1].equals(pass)) {
                    System.out.println("Successfully logged in.");
                    return;
                }
            }
            System.out.println("Incorrect username or password.");
        } catch (IOException ioe) {
            System.out.println("An Error Occurred! Please Try Again.");
        }
    }
}
