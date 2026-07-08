package oops_practice;

public class Cat extends Dog{
    void show(){
        System.out.println("CAT");
    }

    public static void main(String[] args) {
        Dog c=new Cat();
        c.show();
    }
}
