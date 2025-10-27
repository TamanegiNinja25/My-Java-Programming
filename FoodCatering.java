import java.util.*;
import java.util.HashMap;
public class FoodCatering {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Boolean running = true;
        String C1 = " C1 MENU FAMILY PLATTER \n"
                + "Spaghetti \n"
                + "Carbonara \n"
                + "Rice \n"
                + "Pork Adobo \n"
                + "Fried Chicken \n"
                + "Sinigang na Bangus \n"
                + "Cupcake \n"
                + "Bottomless tea and water \n";
        String C2 = " C2 MENU FAMILY PLATTER \n"
                + "Carbonara \n"
                + "Mac and Cheese \n"
                + "Rice Beef Caldereta \n"
                + "Lechon Kawali \n"
                + "Buttered Chicken \n"
                + "Leche Flan \n"
                + "Bottomless tea and water \n";
        String C3 = " C3 MENU FAMILY PLATTER \n"
                + "Carbonara \n"
                + "Lasagna \n"
                + "Rice \n"
                + "Boneless Chicken \n"
                + "Fish Fillet \n"
                + "Pork Menudo \n"
                + "Coffee Jelly \n"
                + "Bottomless tea and water \n";
        System.out.println("Welcome to Food Eatery!");
        System.out.println("-------------------------------------------------------------");
        System.out.println("[1] To View our Menu");
        System.out.println("[2] To Order from the Menu");
        System.out.println("[3] To View your Cart");
        System.out.println("[4] To Total your Bill");
        System.out.println("[5] To End and Cancel Transaction");
        System.out.println("Select the number of Action you want to do: ");
        int action = sc.nextInt();
        switch (action){
            case 1:
                System.out.println("Here is the list of menu: \n" +C1 +C2 +C3);

            case 2:
                System.out.println("Enter the Menu Number to Order: ");
                String decision1 = sc.nextLine();
                if (decision1 == C1){
                    System.out.println("You ordered C1 Family Menu Platter! \n"+C1);
                }
                else if (decision1 == C2){
                    System.out.println("You ordered C1 Family Menu Platter! \n"+C2);
                }
                else if (decision1 == C3){
                    System.out.println("You ordered C1 Family Menu Platter! \n"+C3);
                }
                else {
                    System.out.println("You haven't ordered yet!");
                    return ;
                    }
                break;
            case 3:
                viewInventory();
                break;
            case 4:

            case 5:
                running = false;
                System.out.println("Exiting the program. Goodbye!");
                break;
            default:

        }
    }
    private static void viewInventory(){
        HashMap<Object, Object> inventory = new HashMap<>();
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Current Inventory:");
            for (Map.Entry<Object, Object> entry : inventory.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
    }
}
}

