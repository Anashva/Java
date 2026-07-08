package oops_practice;

public interface Calculator {
    int add(int a,int b);

    public static void main(String[] args) {
        Calculator c=(a,b)->a+b;
        System.out.println(c.add(3,5));
    }
}
