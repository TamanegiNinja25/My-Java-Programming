class AmountDue{
    private double price;
    private double quantity;
    private double discount;
    public double computeAmountDue(double price){
        double result = price * .12;
        double total = price + result;
        return total;
    }
    public double computeAmountDue(double price, double quantity){
        double result = price * .12;
        double total = ((price * quantity)+result);
        return total;
    }
    public double computeAmountDue(double price, double quantity, double discount) {
        double result = price * .12;
        double total = (((price * quantity) - discount) + result);
        return total;
    }
}