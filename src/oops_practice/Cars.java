package oops_practice;

public class Cars {
//    Engine e=new Engine();//direct dependency
//    void  drive(){
//        e.start();// it will always use engine only
//    }
//    private Engine e;
//    Cars(Engine e){
//        this.e=e;
//    }
    void drive(Engine e){//dependency
        e.start();
        System.out.println("Cr driving");
    }
    void add(int a,double b){
        System.out.println(a+b);
    }
    void add(double a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Engine e=new Engine();
        Cars c=new Cars();
        c.drive(e);
//        c.add(10,10);
//        Cars c=new Cars();
//        c.drive();
    }
}

