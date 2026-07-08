package oops_practice;

public class local {
    void display(){
        class outer{
            void ms(){
                System.out.println("hello");
            }
        }
        outer l=new outer();
        l.ms();
    }

    public static void main(String[] args) {
        local ll=new local();
        ll.display();
    }
}
