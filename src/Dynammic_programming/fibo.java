package Dynammic_programming;

import java.util.Arrays;

public class fibo {
    public static void main(String[] args) {
        int n=8;
        int[] dp=new int[n+1];
        System.out.println(tabulation(n,dp));
        Arrays.fill(dp,-1);
        System.out.print(recurs(n,dp));
    }
    public static int recurs(int n,int[] dp){
//        memoization
        if(n<=1){
            dp[n]=n;
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=recurs(n-1,dp)+recurs(n-2,dp);
        return dp[n];

    }
    public static int tabulation(int n,int[] dp){
//        tc->O(n)
//        tabulation
        dp[0]=0;
        dp[1]=1;
        for(int state=2;state<=n;state++){
            dp[state]=dp[state-1]+dp[state-2];
        }
        return dp[n];
    }
}
