package cf;

import java.util.Scanner;

public class Exciting_Bets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a==b){
                System.out.println(0+" "+0);
            }
            else{
                long diff=Math.abs(a-b);
                long mod=a%diff;
                long m=Math.min(mod,diff-a%diff);
                System.out.println(diff+" "+m);

            }
        }
    }
}
