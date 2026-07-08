package oops_practice;

public class carr extends car{

    void run(){
        System.out.println("dhoni");
    }

    public static void main(String[] args) {
        car c=new carr();
//        c.val;
        c.run();
        System.out.println(c.val);
    }

}
