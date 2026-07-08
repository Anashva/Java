package lecture47;

import java.util.Arrays;
public class Coin_Change2 {
    public static void main(String[] args) {
        int amount=5;
        int[] arr={1,2,5};
        int[][] dp=new int[amount+1][arr.length];
        for (int[] a:dp){
            Arrays.fill(a,-1);
        }
        coin_change(arr,amount,0,dp);
        System.out.println(coin_change(arr,amount,0,dp));
        System.out.println(BU(arr,amount));

    }
    public static int coin_change(int[] coin,int amount,int idx,int[][] dp){
        if(amount==0){
            return 1;
        }
        if(idx==coin.length){
            return 0;
        }
        if(dp[amount][idx]!=-1){
            return dp[amount][idx];
        }
        int inc=0;
        int exc=0;
        if(amount>=coin[idx]){
            inc=coin_change(coin,amount-coin[idx],idx,dp);
        }
        exc=coin_change(coin,amount,idx+1,dp);
        return dp[amount][idx]=inc+exc;
    }

    public static int BU(int[] coin,int amount){
        int[][] dp=new int[coin.length+1][amount+1];

        for (int i=0;i<dp.length;i++){//row
            dp[i][0]=1;
        }
        for (int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                int exc=0;
                int inc=0;
               if(j>=coin[i-1]){
                   inc=dp[i][j-coin[i-1]];
               }
               exc=dp[i-1][j];
               dp[i][j]=inc+exc;
            }

        }

        return dp[dp.length-1][dp[0].length-1];
    }
}
