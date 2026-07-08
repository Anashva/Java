package CODE_FORCES;

import java.util.Scanner;

public class sum {
    public static void main(strin[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a==b+c){
            System.out.print("YES");
        }
        if(b==a+c){
            System.out.print("YES");
        }
        if(c==a+b){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }

    }
}
