package cf;

import java.util.Scanner;

public class Mishka_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0;
        int c=0;
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                m++;
            }
            else if(a<b) {
                c++;
            }
        }
        if(m>c){
            System.out.println("Mishka");
        } else if (m==c) {
            System.out.println("Friendship is magic!^^");
        }
        else {
            System.out.println("Chris");
        }
    }
}
