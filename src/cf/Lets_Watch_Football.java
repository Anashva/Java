package cf;

import java.util.Scanner;

public class Lets_Watch_Football {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int deficit = a * c - c * b;
        int waitTime = (deficit + b - 1) / b;
        System.out.println(waitTime);
    }
}
