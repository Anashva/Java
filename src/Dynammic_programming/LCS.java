package Dynammic_programming;

import java.util.*;

public class LCS {
    public static void main(String[] args) {
        String s1="abcde";
        String s2="abc";
        System.out.println(lcs(s1,s2,0,0));
        int[][] dp=new int[s1.length()+1][s1.length()+1];
        for (int[] a :dp){
            Arrays.fill(a,-1);
        }

        System.out.println(lcsTD(s1,s2,0,0,dp));
        System.out.println(lcsBU(s1,s2));
    }
    public static int lcs(String s,String t,int i,int j){
        if(i==s.length() || j==t.length()){
            return 0;
        }
        int ans=0;
        if(s.charAt(i)==t.charAt(j)){
            ans=1+lcs(s,t,i+1,j+1);
        }
        else{
            int l=lcs(s,t,i+1,j);
            int r=lcs(s,t,i,j+1);
            ans=Math.max(l,r);
        }
        return ans;
    }
    public static int lcsTD(String s,String t,int i,int j,int [][] dp){
        if(i==s.length() || j==t.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if(s.charAt(i)==t.charAt(j)){
            ans=1+lcsTD(s,t,i+1,j+1,dp);
        }
        else{
            int l=lcsTD(s,t,i+1,j,dp);
            int r=lcsTD(s,t,i,j+1,dp);
            ans=Math.max(l,r);
        }
        return dp[i][j]=ans;
    }
    public static int lcsBU(String s,String t){
        int[][] dp=new int[s.length()+1][t.length()+1];
        for (int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    int l=dp[i-1][j];
                    int r=dp[i][j-1];
                    dp[i][j]=Math.max(l,r);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

}
