package assign_package;

import java.util.Scanner;

public class sum_of {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        linked l1=new linked();
        linked l2=new linked();
        for (int i=0;i<n;i++){
            int x=sc.nextInt();
            l1.add(x);
        }
        for (int i=0;i<m;i++){
            int x=sc.nextInt();
            l2.add(x);
        }
        l1.head=l1.reverse(l1.head);
        nodee t1=l1.head;
        l2.head=l2.reverse(l2.head);
        nodee t2=l2.head;
        int c=0;
        nodee sum=new nodee(0);
        nodee dumm=sum;
        while(t1!=null && t2!=null){
            int s=t1.val+t2.val+c;
            dumm.next=new nodee(s%10);
            dumm=dumm.next;
            t1=t1.next;
            t2=t2.next;
            c=s/10;
        }
        while(t1!=null){
            int s=t1.val+c;
            dumm.next=new nodee(s%10);
            dumm=dumm.next;
            t1=t1.next;
            c=s/10;
        }
        while(t2!=null){
            int s=t2.val+c;
            dumm.next=new nodee(s%10);
            dumm=dumm.next;
            t2=t2.next;
            c=s/10;
        }
        if(c!=0){
            dumm.next=new nodee(c);
        }
        sum=sum.next;
        nodee result = l1.reverse(sum);
        while(result!=null){
            System.out.print(result.val+" ");
            result=result.next;
        }
    }
}
