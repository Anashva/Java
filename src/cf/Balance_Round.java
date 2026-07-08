package cf;

import java.util.Arrays;
import java.util.Scanner;

public class Balance_Round {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int ans=1;
            int  c=1;
            for (int i=1;i<n;i++){
                if (arr[i]-arr[i-1]<=m){
                    c++;
                    ans=Math.max(ans,c);
                }
                else {
                    c=1;
                }
            }
            System.out.println(n-ans);
        }
    }
}
