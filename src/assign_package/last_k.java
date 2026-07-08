package assign_package;

import java.util.Scanner;
class nodee{
    int val;
    nodee next;
    nodee(int val){
        this.val=val;
        this.next=null;
    }
}
class linked{
    nodee head;
    nodee tail;
    int size;
    linked(){
        head=null;
        tail=null;
    }

    public void add(int item){
        if(head==null){
            head=new nodee(item);
            tail=head;
            return;
        }
        nodee temp=new nodee(item);
        tail.next=temp;
        tail=tail.next;
//        return;
    }
    public void display(){
        nodee temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public nodee reverse(nodee head){
        nodee cur=head;
        nodee prev=null;
        while(cur!=null){
            nodee ahead=cur.next;
            cur.next=prev;
            prev=cur;
            cur=ahead;
        }
        return prev;
    }
}
public class last_k {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linked ll=new linked();
        int c=0;
        while(true){
            int x=sc.nextInt();
            if(x==-1){
                break;
            }
            ll.add(x);
        }
        int n=sc.nextInt();
        ll.head = ll.reverse(ll.head);
        nodee temp=ll.head;
        while(temp!=null){
            c++;
            if(c==n){
                System.out.print(temp.val);
            }
            temp=temp.next;
        }
    }
}
