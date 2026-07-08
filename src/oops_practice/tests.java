package oops_practice;

public class tests {
    public static void main(String[] args) {
        Animal a=new Animal() {
            @Override
            void sound() {
                System.out.println("bark");
            }
        };
        a.sound();
    }
}
