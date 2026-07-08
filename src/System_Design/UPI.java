package System_Design;

public class UPI implements UberPayment{
    private double amount;
    public UPI(double amount){
        this.amount=amount;
    }
    public double pay(double amount){
        System.out.println(this.amount);
        return amount;
    }
}
