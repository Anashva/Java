package oops_practice;

public class C implements A,B{
    public void show(){
//        A.super.show();
        System.out.print("C");
    }

    public static void main(String[] args) {
        C c=new C();
        c.show();
    }
}
