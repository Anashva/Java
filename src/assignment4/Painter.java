package assignment4;

import java.util.Scanner;

public class Painter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int[] length_board=new int[n];
        for(int i=0;i<n;i++){
            length_board[i]=sc.nextInt();
        }
        int l=0;
        int h=0;
        int ans=0;
        for(int i=0;i<n;i++){
            l=Math.max(l,length_board[i]);
            h+=length_board[i];
        }
        while(l<=h){
            int t=0;
            int c=1;
            int mid=l+(h-l)/2;
            for(int i=0;i<n;i++){
                t+=length_board[i];
                if(t>mid){
                    c++;
                    t=length_board[i];
                }
            }
            if(c<=k){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.print(ans);
    }
}
