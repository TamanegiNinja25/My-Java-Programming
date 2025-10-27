import java.util.*;
import java.nio.file.*;
import java.io.*;
public class Database {
    public Database(){
        Scanner sc = new Scanner(System.in);
        String filename = "C:\\Users\\稲村カルロ\\IdeaProjects\\Task Performance\\src\\records.txt";
        Path file = Paths.get(filename.toString());
        String username;
        String password;
        int choice = 0;
        while (choice != 3) {
            System.out.println("Select an option: ");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Quit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
