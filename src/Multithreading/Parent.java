package Multithreading;

public class Parent {
    public static void main(String[] args) {
//        wihtout multithreading
        MyThread mt=new MyThread();
        mt.run();
        for(int i=1;i<=100;i++){
            System.out.println("child");
        }
//        for(int i=1;i<=100;i++){
//            System.out.println("child");
//        }

    }
}
