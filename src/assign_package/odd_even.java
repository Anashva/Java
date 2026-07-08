package assign_package;

import java.util.Scanner;

class node{
    int val;
    node next;
    node(int val){
        this.val=val;
        this.next=null;
    }
}
class linkedlist{
    node head;
    node tail;
    int size;
    linkedlist(){
       head=null;
       tail=null;
    }

    public void add(int item){
        if(head==null){
            head=new node(item);
            tail=head;
            return;
        }
        node temp=new node(item);
        tail.next=temp;
        tail=tail.next;
        return;
    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}
public class odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        linkedlist ll=new linkedlist();
        for (int i=0;i<n;i++){
            int x=sc.nextInt();
            ll.add(x);
        }
        node odd=new node(0);
        node dumm1=odd;
        node even=new node(0);
        node dumm2=even;
        node temp  =ll.head;
        while(temp!=null){
            int x=temp.val;
            if(x%2==1){
                dumm1.next=temp;
                dumm1=dumm1.next;
            }
            else {
                dumm2.next=temp;
                dumm2=dumm2.next;
            }
            temp=temp.next;
        }
        dumm2.next=null;
        dumm1.next=even.next;
        odd=odd.next;
        while(odd!=null){
            System.out.print(odd.val+" ");
            odd=odd.next;
        }

    }
}
