package cf;

import java.util.Scanner;

public class Vasya_hipster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.print(a+" "+0);
        }
        else{
            if(a>b){
                int c=a-b;
                int d=c/2;
                System.out.print(b+" "+d);
            }
            else{
                int c=b-a;
                int d=c/2;
                System.out.print(a+" "+d);
            }
        }
    }
}
