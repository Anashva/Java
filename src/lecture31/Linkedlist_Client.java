package lecture31;

import DSA.LinkedList;

public class Linkedlist_Client {
    public static void main(String[] args)  throws Exception{
        linkedlist ll=new linkedlist();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddFirst(40);
        ll.Addlast(50);
//        ll.Display();
//        ll.Addlast(10);
//        ll.Addlast(20);
//        ll.Addlast(30);
//        ll.Addlast(40);
//        System.out.println(ll.removelast());
//        System.out.println(ll.remove_at_index(2));
        ll.Display();

    }
}
