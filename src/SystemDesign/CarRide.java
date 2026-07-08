package SystemDesign;

public class CarRide extends Ride{
    public void ride(){
        System.out.println("Car Ride");
    }

    public static void main(String[] args) {
        Ride r=new CarRide();
        r.ride();
    }
}
