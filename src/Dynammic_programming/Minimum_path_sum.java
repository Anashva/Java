package Dynammic_programming;
import java.util.*;
public class Minimum_path_sum {
    public static void main(String[] args) {
       int[][] grid= { {1,3,1} ,{1,5,1} ,{4,2,1}};
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(memoization(grid,dp,0,0,n,m));
    }
    public static int memoization(int[][] grid,int[][]dp,int i,int j,int n,int m){
        if(i>=n || j>=m){
            return Integer.MAX_VALUE;
        }
        if(i==n-1 && j==m-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int r=memoization(grid,dp,i,j+1,n,m);
        int d=memoization(grid,dp,i+1,j,n,m);
        return  dp[i][j]=grid[i][j]+Math.min(r,d);
    }
}
