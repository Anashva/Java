package Dynammic_programming;

import java.util.*;

public class coin_change_2 {
    public static void main(String[] args) {
        int amount=5;
        int[] coin={1,2,5};
        System.out.println(cc2(coin,amount,0));
        int[][] dp=new int[amount+1][coin.length];
        for (int[] i:dp){
            Arrays.fill(i,-1);
        }
        System.out.println(cc2TB(coin,amount,0,dp));
        System.out.println(BU(coin,amount));
    }
    public static int cc2(int[] coin,int amount,int idx){
        if(amount==0){
            return 1;
        }
        if (idx==coin.length){
            return 0;
        }
        int inc=0;
        int exc=0;
        if(amount>=coin[idx]){
            inc=cc2(coin,amount-coin[idx],idx);
        }
        exc=cc2(coin,amount,idx+1);
        return inc+exc;
    }
    public static int cc2TB(int[] coin,int amount,int idx, int[][] dp){
        if(amount==0){
            return 1;
        }
        if (idx==coin.length){
            return 0;
        }
        if(dp[amount][idx]!=-1){
            return dp[amount][idx];
        }
        int inc=0;
        int exc=0;
        if(amount>=coin[idx]){
            inc=cc2TB(coin,amount-coin[idx],idx,dp);
        }
        exc=cc2TB(coin,amount,idx+1,dp);
        return dp[amount][idx]=inc+exc;
    }
    public static int BU(int[] coin,int amount){
        int[][] dp=new int[amount+1][coin.length+1];

        for (int i=0;i<dp[0].length;i++){
            dp[0][i]=1;
        }
        for (int i=1;i<dp.length;i++){//amount
            for (int j=1;j<dp[0].length;j++){//coin
                int inc=0;
                int exc=0;
                if(i>=coin[j-1]){
                    inc=dp[i-coin[j-1]][j];//jab coin pick krenge utna index piche jaenge row me
                }
                exc=dp[i][j-1];//ek index piche jaenge agr pick nhi krenge
                dp[i][j]=inc+exc;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
