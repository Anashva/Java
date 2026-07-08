package Dynammic_programming;

import java.util.*;

public class Distinct_Subsequence {
    public static void main(String[] args) {
        String s="rabbbit";
        String t="rabbit";
        int[][] dp=new int[s.length()][t.length()];
        for(int [] a:dp){
            Arrays.fill(a,-1);
        }
        System.out.println(TB(s,t,0,0,dp));
    }
//    i-s ->coin ki trh behave krega
//    j-t-> amount ki trh behave krega
    public static int BU(String s,String t){
        int[][] dp=new int[t.length()+1][s.length()+1];

        for (int i=0;i<dp[0].length;i++){//coin
            dp[0][i]=1;
        }
//        for (int i=1;i<dp.length;i++){//amount
//            for (int j=1;j<dp[0].length;j++){//coin
//                int inc=0;
//                int exc=0;
//                if(s.charAt(j-1)==t.charAt(i)){
//                    inc=dp[i-coin[j-1]][j];
//                }
//                exc=dp[i][j-1];
//                dp[i][j]=inc+exc;
//            }
//        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static int TB(String s,String t,int i,int j, int[][] dp){
        if(j==t.length()){//amount->0
            return 1;
        }
        if (i==s.length()){//coin empty=>0
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int inc=0;
        int exc=0;
        if(s.charAt(i)==t.charAt(j)){
            inc=TB(s,t,i+1,j+1,dp);
        }
        exc=TB(s,t,i+1,j,dp);
        return dp[i][j]=inc+exc;
    }
}
