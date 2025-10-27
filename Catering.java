import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Catering {
    private static Map<String, Integer> inventory = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. View Inventory");
            System.out.println("2. Add to Inventory");
            System.out.println("3. Select an Item");
            System.out.println("4. Calculate Total Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    viewInventory();
                    break;
                case 2:
                    addToInventory(scanner);
                    break;
                case 3:
                    selectItem(scanner);
                    break;
                case 4:
                    calculateTotalInventory();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
        scanner.close();
    }

    private static void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Current Inventory:");
            for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    private static void addToInventory(Scanner scanner) {
        System.out.print("Enter the item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter the quantity to add: ");
        int quantity = scanner.nextInt();

        if (inventory.containsKey(itemName)) {
            int currentQuantity = inventory.get(itemName);
            inventory.put(itemName, currentQuantity + quantity);
        } else {
            inventory.put(itemName, quantity);
        }
        System.out.println(quantity + " " + itemName + "(s) added to the inventory.");
    }

    private static void selectItem(Scanner scanner) {
        System.out.print("Enter the item name to select: ");
        String itemName = scanner.nextLine();

        if (inventory.containsKey(itemName)) {
            System.out.println("Selected item: " + itemName + ", Quantity: " + inventory.get(itemName));
        } else {
            System.out.println("Item not found in the inventory.");
        }
    }

    private static void calculateTotalInventory() {
        int totalItems = 0;
        for (int quantity : inventory.values()) {
            totalItems += quantity;
        }
        System.out.println("Total inventory count: " + totalItems);
    }
}