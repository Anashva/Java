package OOPS_LECTURE1;

public class Queue {
    public static void main(String[] args) throws Exception{
//        Queue=FIFO
//        add=equeu
//        remove=dequeue
        queues q=new queues();
        q.equeue(10);
        q.equeue(20);
        q.equeue(30);
        q.equeue(40);
//        q.equeue(50);
        q.Display();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.equeue(60);
        q.equeue(70);
        q.Display();
    }
}
