package CODE_FORCES;

import java.util.Scanner;

public class hi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int x=sc.nextInt();
            int p=sc.nextInt();
            int d=-p;
            if(x>a*p ||x<a*d){
                System.out.println(-1);
            }
            else{
                int s=(int) Math.ceil((double) Math.abs(x)/p);
                System.out.println(s);
            }
        }
    }
}
