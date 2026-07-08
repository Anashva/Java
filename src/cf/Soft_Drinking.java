package cf;

import java.util.Scanner;

public class Soft_Drinking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        int a=k*l;
        int b=a/nl;
        int x=c*d;
        int m=p/np;
        int min=Math.min(b,x);
        min=Math.min(m,min);
        System.out.print(min/n);
    }
}
