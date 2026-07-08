package cf;

import java.util.Scanner;

public class coin_transfromation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            if(n<=3){
                System.out.println(1);
            }
            else {
                System.out.println(maxCoins(n));
            }
        }
    }
    public static long maxCoins(long n) {
        long result = 1;
        while (n > 3) {
            result *= 2;
            n /= 4;
        }
        return result;
    }
}
