import java.util.*;

public class Ordering{
    public static int main(String[]args){
        int num1;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Food Eatery!");
        System.out.println("[1] Menu");
        System.out.println("[2] View Cart Inventory");
        System.out.println("[3] Bill Out");
        System.out.println("[4] End Transaction");
        System.out.println("Select the number of action: ");
        int view = sc.nextInt();
        for(int i = 0;i<10;i++){
            switch (i){
                case 1:
                    System.out.println("Menu Sets");
                    System.out.println("");
                    System.out.println("C1 Family Platter 1");
                    System.out.println("Spaghetti");
                    System.out.println("Carbonara");
                    System.out.println("Rice");
                    System.out.println("Adobo Pork");
                    System.out.println("Fried Chicken");
                    System.out.println("Sinigang Bangus");
                    System.out.println("Cupcake");
                    System.out.println("Unlimited Ice Tea & Water");
                    System.out.println("");

                    System.out.println("C2 Family Platter 2");
                    System.out.println("Carbonara");
                    System.out.println("Mac & Cheese");
                    System.out.println("Rice");
                    System.out.println("Beef Caldereta");
                    System.out.println("Lechon Kawali");
                    System.out.println("Buttered Chicken");
                    System.out.println("Flan");
                    System.out.println("Unlimited Ice Tea & Water");
                    System.out.println("");

                    System.out.println("C3 Family Platter 3");
                    System.out.println("Carbonara");
                    System.out.println("Lasagna");
                    System.out.println("Rice");
                    System.out.println("Boneless Chicken");
                    System.out.println("Fish Fillet");
                    System.out.println("Pork Menudo");
                    System.out.println("Coffee Jelly");
                    System.out.println("Unlimited Ice Tea & Water");
                    System.out.println("");
                    System.out.println("What would you like to order?");
                    int order = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Here is your ordered item: ");

                case 3:
                case 4:
                    System.out.println("Order Cancelled.");
                    System.out.println("--------------End of Transaction---------------");
                    return i;
                default:
                    System.out.println("Invalid Function!");

            }
        }
    }
}