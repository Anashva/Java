package oops_practice;

public class Box<T>{
    private T value;
    void set(T value){
        this.value=value;
    }
    T get(){
        return value;
    }
    public static <T> void print(T value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        Box<Integer> b=new Box<>();
        b.set(10);
        System.out.println(b.get());
        Box.print("anashva");
    }
}
