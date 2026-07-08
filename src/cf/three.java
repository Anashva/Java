package cf;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int s=a+b+c;
            if(s%3!=0){
                System.out.println("NO");
            }
            else{
                int k=s/3;
                if(k>=a && k>=b && k<=c){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }
    }
}
