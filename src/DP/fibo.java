package DP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class fibo {
    public static void main(String[] args) {
        int n=5;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibo(n,dp));
        System.out.println();
        System.out.println(fib(n,dp));
    }
    public static int  fibo(int n,int [] dp){
//        memoization-TC->O(n),SC->O(n)
        if(n==1 || n==0){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int f1=fibo(n-1,dp);
        int f2=fibo(n-2,dp);
        return dp[n]=f1+f2;
    }
    public static int fib(int n,int[] dp){
//        tabulation method:-TC-<O(n),SC->O(1)
        dp[0]=0;
        dp[1]=1;
        for (int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
