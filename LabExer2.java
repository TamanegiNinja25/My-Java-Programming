import java.util.*;
public class LabExer2{
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private double amountDue;
    Scanner scan = new Scanner(System.in);
    public void setItemName(String newItemName){
        this.itemName = itemName;
        itemName = scan.nextLine();
    }
    public void setTotalCost(int quantity, double price){  
        quantity = scan.nextInt();
        price = scan.nextDouble();
        this.amountDue = quantity * price;
          
    }
    public String getItemName(){
        return itemName;
    }
    public double getTotalCost(){  
        return amountDue;
    }
    public void readInput(){
       System.out.println("Enter the name of item you are purchasing: ");
       itemName = scan.nextLine();
       System.out.println("Enter the Quantity of item you want to have: ");
       itemQuantity = scan.nextInt();
       System.out.println("Enter the price of the item selected: ");
       itemPrice = scan.nextDouble();
       amountDue = itemQuantity * itemPrice;
    }
    public void writeOutput(){
        System.out.println("Your are purchasing " + itemQuantity + " " + itemName + "(s) at " + itemPrice);
        System.out.printf("Amount Due is : %2f " , amountDue);
    }
    public static void main(String[]args){
        LabExer2 lab = new LabExer2();
        lab.readInput();
        lab.writeOutput();
    }
}