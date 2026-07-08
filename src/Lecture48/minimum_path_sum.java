package Lecture48;

import java.util.Arrays;

public class minimum_path_sum {
    public static void main(String[] args) {
        int[][] grid={{1,3,1},{1,5,1},{4,2,1}};
        int[][] dp=new int[grid.length][grid[0].length];
        for (int[] a:dp){
            Arrays.fill(a,-1);
        }
        System.out.println(minium(grid,0,0,dp));
    }
    public static int minium(int[][] grid,int cr,int cc,int[][] dp){
        if(cc>= grid[0].length || cr>=grid.length){
            return Integer.MAX_VALUE;
        }

        if (cr== grid.length-1 && cc==grid[0].length-1){
            return grid[cr][cc];
        }

        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }

        int r=minium(grid,cr,cc+1,dp);
        int d=minium(grid,cr+1,cc,dp);
        return dp[cr][cc]=Math.min(d,r)+grid[cr][cc];
    }
}
