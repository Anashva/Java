package codeforce_practice;

import java.util.Scanner;

public class Two_Frog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int a= sc.nextInt();
            int b= sc.nextInt();
            if((Math.abs(a-b))%2==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
