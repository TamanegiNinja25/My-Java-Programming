import java.util.Scanner;

public class RunAmountDue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        AmountDue ad = new AmountDue();
        System.out.println("Welcome to the Tax Computing Services");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Choose the number you want to display");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("[1] - View Price ONLY.");
        System.out.println("[2] - View Price and Quantity of item.");
        System.out.println("[3] - View the price, quantity and amount of discount.");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Enter the number of choice: ");
        int choice = scan.nextInt();
        System.out.println("Thank you for your input!");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("The number you have chosen is: " + choice);
            if(choice == 1){
                System.out.println("Enter the price of item you have: ");
                double price = scan.nextDouble();
                System.out.println("The total is: " +ad.computeAmountDue(price));
            }
            else if(choice == 2){
                System.out.println("Enter the price of item you have: ");
                double price = scan.nextDouble();
                System.out.println("Enter the quantity of item you have: ");
                double quantity = scan.nextDouble();
                System.out.println("You have the total of: " + ad.computeAmountDue(price, quantity));
            }
            else if(choice == 3){
                System.out.println("Enter the price of item you have: ");
                double price = scan.nextDouble();
                System.out.println("Enter the the quantity of item you have: ");
                double quantity = scan.nextDouble();
                System.out.println("Enter the amount of discount you get: ");
                double discount = scan.nextDouble();
                System.out.println("The total is: " + ad.computeAmountDue(price, quantity, discount));
            }
            else{
                System.out.println("Error! Input does not count!");
            }
    }
}
