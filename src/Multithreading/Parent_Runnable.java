package Multithreading;

public class Parent_Runnable {
    public static void main(String[] args) {
        Mythread_runnable mt=new Mythread_runnable();
//        mt.run();
        Thread t=new Thread(mt);
        t.start();
        for(int i=1;i<=100;i++){
            System.out.println("child");
        }
    }
}
