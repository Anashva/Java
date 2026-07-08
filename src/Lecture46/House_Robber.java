package Lecture46;

import java.lang.reflect.Array;
import java.util.Arrays;

public class House_Robber {
    public static void main(String[] args) {
        int[] arr={2,7,9,3,1};
        int[] dp=new int[arr.length+1];
        Arrays.fill(dp,-1);
        System.out.println(robber(arr,0,dp));
    }
    public static int robber(int[] arr,int i,int [] dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob=arr[i]+robber(arr,i+2,dp);
        int nrob=robber(arr,i+1,dp);
        return dp[i]=Math.max(rob,nrob);
    }
}
