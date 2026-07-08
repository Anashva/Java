package Lecture46;

import java.util.Arrays;

public class bottomUp {
    public static void main(String[] args) {
        int[] arr={2,7,9,3,1};
//        int[] dp=new int[arr.length];
//        Arrays.fill(dp,-1);
        System.out.println(BU(arr));
    }
    public static int BU(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for (int i=2;i<dp.length;i++){
            int rob=arr[i]+dp[i-2];
            int nrob=dp[i-1];
            dp[i]=Math.max(rob,nrob);
        }
        return dp[dp.length-1];
    }
}
