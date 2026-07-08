package System_Design;

public class PaymentServices {
    private UberPayment up;
    public PaymentServices(UberPayment up){
        this.up=up;
    }
    public void payment(double amount){
        System.out.println(up.pay(amount));
    }

    public static void main(String[] args) {
        UberPayment up=new UPI(200);
        PaymentServices ps=new PaymentServices(up);
        ps.payment(400);

    }
}
