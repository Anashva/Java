package oops_practice;

public class Test implements Outer.Inner{
    public void show(){
        System.out.println("nested interface");
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.show();
    }
}
