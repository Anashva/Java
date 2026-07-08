package Lecture48;

import java.util.Arrays;

public class knapsack_problem {
    public static void main(String[] args) {
        int[] wt= {1,2,3,2,2};
        int[] val={8,4,0,5,3};
        int cap=4;
        int[][] dp=new int[wt.length][cap+1];
        for (int[] a:dp){
            Arrays.fill(a,-1);
        }
        System.out.println(TD(wt,val,cap,0,dp));
    }
    public static int ks(int[] wt,int[]val,int cap,int i){
        if(cap==0 || i==wt.length){
            return 0;
        }
        int inc=0;
        int exc=0;
        if(cap>=wt[i]){
            inc=ks(wt,val,cap-wt[i],i+1)+val[i];
        }
        exc=ks(wt,val,cap,i+1);
        return Math.max(inc,exc);
    }

    public static int TD(int[] wt,int[]  val,int cap,int i,int[][] dp){
        if(cap==0 || i==wt.length){
            return 0;
        }
        if(dp[i][cap]!=-1){
            return dp[i][cap];
        }
        int inc=0;
        int exc=0;
        if(cap>=wt[i]){
            inc=TD(wt,val,cap-wt[i],i+1,dp)+val[i];
        }
        exc=TD(wt,val,cap,i+1,dp);
        return dp[i][cap]= Math.max(inc,exc);
    }
}
