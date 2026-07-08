package cf;

import java.util.Scanner;

public class New_Year_and_Hurry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=1;
        int h=n;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(5*mid* (mid + 1) / 2<=240-k){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        System.out.println(ans);
    }
}
