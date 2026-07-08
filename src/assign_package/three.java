package assign_package;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        linked l1=new linked();
        linked l2=new linked();
        linked l3=new linked();
        for (int i=0;i<n;i++){
            int x=sc.nextInt();
            l1.add(x);
        }
        for (int i=0;i<m;i++){
            int x=sc.nextInt();
            l2.add(x);
        }
        for (int i=0;i<k;i++){
            int x=sc.nextInt();
            l3.add(x);
        }
        int x=sc.nextInt();
        nodee t1=l1.head;
        nodee t2=l1.head;
        nodee t3=l1.head;
        while(t1!=null){
            while(t2!=null){
                while (t3!=null){
                    if(t1.val+t2.val+t3.val==x){
                        System.out.print(t1.val+" "+t2.val+" "+t3.val);
                        return;
                    }
                    t3=t3.next;
                }
                t2=t2.next;
                t3=l3.head;
            }
            t1=t1.next;
            t2=l2.head;
        }

    }
}
