package DP;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] house={7,5,3,13,1};
        int[] dp=new int[house.length];
        Arrays.fill(dp,-1);
//        System.out.println(rob(0,dp,house));
//        System.out.println();
//        System.out.println(rob2(house, house.length-1,dp ));
        System.out.println(BU(house,dp));
    }
    public static int rob(int i,int[] dp,int [] house){
//        memoization
        if(i>= house.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int h1=house[i]+rob(i+2,dp,house);
        int h2=rob(i+1,dp,house);
        return dp[i]=Math.max(h2,h1);
    }
    public static int rob2(int[] arr,int i,int [] dp){
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob=arr[i]+rob2(arr,i-2,dp);
        int dontrob=rob2(arr,i-1,dp);
        return dp[i]=Math.max(rob,dontrob);
    }
    public static int BU(int[] arr,int [] dp){
        if(arr.length==1){
            return arr[0];
        }
        dp[0]=arr[0];
        dp[1]=Math.max(arr[1],dp[0]);
        for (int i=2;i<arr.length;i++){
            int r1=arr[i]+dp[i-2];
            int nr=dp[i-1];
            dp[i]=Math.max(r1,nr);
        }
        return dp[dp.length-1];
    }
}
