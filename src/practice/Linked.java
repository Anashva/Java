package practice;

public class Linked {
    Node head;
    class Node{
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    void end(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void start(int val){
        Node nhead=new Node(val);
        nhead.next=head;
        head=nhead;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Linked ll=new Linked();
//        ll.end(10);
//        ll.end(20);
//        ll.end(30);
//        ll.end(40);
//        ll.display();
//        System.out.println();
        ll.start(1);
        ll.start(2);
        ll.start(3);
        ll.start(4);
        ll.start(5);
        ll.display();
    }
}
