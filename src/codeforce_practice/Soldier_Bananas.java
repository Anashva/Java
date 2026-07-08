package codeforce_practice;

import java.util.Scanner;

public class Soldier_Bananas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
        int n= sc.nextInt();
        int w= sc.nextInt();
        int sum=0;
        for(int i=1;i<=w;i++){
            sum+=i*k;
        }
        System.out.println(Math.max(sum-n,0));
    }
}
