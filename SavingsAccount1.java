class SavingsAccount1{
    private double balance;
    public SavingsAccount1(){
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