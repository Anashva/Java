package Dynammic_programming;

import java.util.Arrays;

public class Edit_distance {
    public static void main(String[] args) {
        String s="FOOD";
        String t="MONEY";
        int[][] dp=new int[s.length()][t.length()];
        for (int[] a:dp){
            Arrays.fill(a,-1);
        }
        System.out.println(ed(s,t,0,0,dp));
    }
    public static int ed(String s,String t,int i, int j,int[][]dp){
        if(s.length()==i){
            return t.length()-j;
        }
        if(t.length()==j){
            return s.length()-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if(s.charAt(i)==t.charAt(j)){
            ans=ed(s,t,i+1,j+1,dp);//dp[i-1][j-1]
        }
        else{
            int d=ed(s,t,i+1,j,dp);//dp[i-1][j]
            int I=ed(s,t,i,j+1,dp);//dp[i][j-1]
            int r=ed(s,t,i+1,j+1,dp);//dp[i-1][j-1]
            ans=1+Math.min(d,Math.min(I,r));
        }
        return dp[i][j]=ans;

    }
}
