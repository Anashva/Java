package cf;

import java.util.Scanner;

public class Treasure_Hunt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long k=sc.nextLong();
            long a= sc.nextLong();
            long rem=a%(k+n);
            if(rem!=0 && rem>=n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
