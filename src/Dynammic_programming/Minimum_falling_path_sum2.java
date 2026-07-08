package Dynammic_programming;

import java.util.Arrays;

public class Minimum_falling_path_sum2 {
    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] dp=new int[n][m];
        for(int [] a:dp){
            Arrays.fill(a,-1000000);
        }
        int ans=Integer.MAX_VALUE;
        for (int i=0;i<m;i++){
            ans=Math.min(ans,mfps2(matrix,dp,0,i));
        }
        System.out.println(ans);
    }

    public static int mfps2(int[][] grid,int[][] dp,int cr,int cc){
        if(cr== grid.length-1){
            return grid[cr][cc];
        }
        if (dp[cr][cc]!=-1000000){
            return dp[cr][cc];
        }
        int ans=Integer.MAX_VALUE;
        for (int i=0;i<grid[0].length;i++){
            if(cc!=i){
                ans=Math.min(ans,mfps2(grid, dp, cr+1, i));
            }
        }
        return dp[cr][cc] =ans+grid[cr][cc];
    }
}
