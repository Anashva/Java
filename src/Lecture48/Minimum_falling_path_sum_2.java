package Lecture48;

import java.util.Arrays;

public class Minimum_falling_path_sum_2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] dp=new int[matrix.length][matrix[0].length];
        for (int [] a:dp){
            Arrays.fill(a,-100000);
        }
        int ans=Integer.MAX_VALUE;
        for (int i=0;i<matrix[0].length;i++){
            ans=Math.min(ans,mfps2(matrix,0,i,dp));
        }
        System.out.println(ans);
    }
    public static int mfps2(int[][] matrix,int cr,int cc,int[][]dp){
        if (cr==matrix.length-1){
            return matrix[cr][cc];
        }

        if(dp[cr][cc]!=-100000){
            return dp[cr][cc];
        }
        int ans=Integer.MAX_VALUE;
        for (int i=0;i<matrix[0].length;i++){
            if(cc==i){
                continue;
            }
            ans=Math.min(ans,mfps2(matrix,cr+1,i,dp));
        }
        return dp[cr][cc]=ans+matrix[cr][cc];
    }
}
