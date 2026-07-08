package System_Design;

public class Card implements UberPayment{
    private double amount;
    public Card(double amount){
        this.amount=amount;
    }
    @Override
    public double pay(double amount) {
        return amount;
    }
}
