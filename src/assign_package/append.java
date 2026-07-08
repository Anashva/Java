package assign_package;

import java.util.Scanner;

public class append {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        linked ll=new linked();
        for (int i=0;i<n;i++){
            int x=sc.nextInt();
            ll.add(x);
        }
        int x= sc.nextInt();
        x=x%n;
        nodee temp= ll.head;
        int s=n-x;
        while(s-->0){
            int v=temp.val;
            ll.add(v);
            temp=temp.next;
        }
        ll.head=temp;
        ll.display();
    }
}
