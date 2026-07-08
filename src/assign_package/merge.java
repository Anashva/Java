package assign_package;

import java.util.Scanner;

public class merge {
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
        nodee mg=new nodee(0);
        nodee dummy=mg;
        nodee t1=l1.head;
        nodee t2=l2.head;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                dummy.next=t1;
                dummy=dummy.next;
                t1=t1.next;
            }
            else{
                dummy.next=t2;
                dummy=dummy.next;
                t2=t2.next;
            }
        }
        if(t1==null){
            dummy.next=t2;
        }
        else {
            dummy.next=t1;
        }
        mg=mg.next;
        while(mg!=null){
            System.out.print(mg.val+" ");
            mg=mg.next;
        }
    }
}
