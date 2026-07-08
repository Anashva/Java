package cf;

import java.util.Scanner;

public class Bobritto {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            for (int lp=l;lp<=r;lp++){
                int rp=lp+m;
                if(rp>r){
                    break;
                }
                if(lp<=0 && rp>=0){
                    System.out.println(lp+" "+rp);
                    break;
                }
            }
        }
    }
}
