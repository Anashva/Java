package oops_practice;

public interface Partial {
    default void start(){
        System.out.println("starting");
    }
    static void info(){
        System.out.print("static method");
    }
}
