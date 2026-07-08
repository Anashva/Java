package linkd;
import java.util.*;
class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}
    class linkedls{
        node head;
        node tail;
        int size;
        linkedls(){
            head=null;
            tail=null;
        }
        public void add(int data){
            if(head==null){
                head=new node(data);
                tail=head;
                return;
            }
            node temp=new node(data);
            tail.next=temp;
            tail=tail.next;
            return;
        }
        public void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
        }
    }
public class linkedl {
    public static void main(String[] args) {
        linkedls ll=new linkedls();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.display();
    }
}
