import java.util.Scanner;
import java.util.Random;
class SavingsAccount{
    private double balance;
    public SavingsAccount(){
        balance = 0;
    }
    public static double interestRate = 0;
    public  static void setinterestRate(double newRate){
        interestRate = newRate;
    }
    public static double getinterestRate(double interestRate){
        return interestRate;
    }
    public void deposit(double  amount){
        balance += amount;
    }
    public double withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }
        else{
            amount = 0;
        }
        return amount;
    }
    public void addInterest(){
        double interest = balance * interestRate;
        balance = balance + interest;
    }
    public double getBalance(){
        return balance;
    }
    public static void showBalance(SavingsAccount account){
        System.out.println("Your Balance is: " + account.getBalance());
    }
}
public class RunSavingsAccount {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        SavingsAccount savings = new SavingsAccount();
        System.out.println("WELCOME TO SAVINGS ACCOUNT!");
        System.out.println("-----------------------------------------------------");
        System.out.println("Please Enter Interest Rate you currently are taking: ");
        savings.interestRate = sc.nextDouble();
        System.out.println("Thank you for your input!");
        System.out.println("-----------------------------------------------------");
        System.out.println("Now Please Enter the amount you want to Deposit: ");
        savings.deposit(sc.nextDouble());
        System.out.println("Thank you for your input!");
        System.out.println("-----------------------------------------------------");
        savings.addInterest();
        savings.showBalance(savings);
        System.out.println("-----------------------------------------------------");
        char userChoice;
        do {
            System.out.println("Would you like to do another Transaction?");
            System.out.println("Press D to deposit another amount.");
            System.out.println("Press W to withdraw said amount.");
            System.out.println("Enter your Choice: ");
            userChoice = sc.next().charAt(0);
            if (userChoice == 'D' || userChoice == 'd') {
                System.out.println("Enter the amount you want to deposit: ");
                savings.deposit(sc.nextDouble());
            } else if (userChoice == 'W' || userChoice == 'w') {
                System.out.println("Enter the amount you want to withdraw: ");
                savings.withdraw(sc.nextDouble());
            } else {
                System.out.println("Invalid choice.");
            }
            SavingsAccount.showBalance(savings);
            System.out.println("-----------------------------------------------------");
        } while (userChoice != 'W' && userChoice != 'w');
        System.out.println("Thank you for using our Savings Account Services!");
    }
}
