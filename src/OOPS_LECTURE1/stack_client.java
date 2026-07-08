package OOPS_LECTURE1;

public class stack_client  {
    public static void main(String[] args) throws Exception {
        stack s=new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.peek());
        s.display();
        s.push(80);
        s.display();

    }
}
