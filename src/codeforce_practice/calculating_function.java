package codeforce_practice;

import java.util.Scanner;

public class calculating_function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        if(n%2==0){
            System.out.println(n/2);
        }
        else{
            System.out.println(-n/2);
        }
    }
}
