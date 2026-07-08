package oops_practice;

public class carrs {
   Engines e;
   carrs(Engines e){//dependecny injection
       this.e=e;
   }
   void drive(){
       e.start();
   }

    public static void main(String[] args) {
        Engines e=new PetrolEngine();// can chane easily
        carrs c=new carrs(e);
        c.drive();

    }
}
