package Dynammic_programming;

import java.util.Arrays;

public class Minimum_falling_path_sum {
    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] dp=new int[n][m];
        for(int [] a:dp){
            Arrays.fill(a,Integer.MAX_VALUE);
        }
        int ans=Integer.MAX_VALUE;
        for (int i=0;i<m;i++){
            ans=Math.min(ans,TD(matrix,dp,0,i,n,m));
        }
        System.out.println(ans);
    }
    public static int mimumTD(int[][] matrix,int i,int j,int n,int m){
        if(j<0 || j>=m){
            return Integer.MAX_VALUE;
        }
        if(i==n-1){
            return matrix[i][j];
        }
        int dl=mimumTD(matrix,i+1,j-1,n,m);
        int dr=mimumTD(matrix,i+1,j+1,n,m);
        int dwon=mimumTD(matrix,i+1,j,n,m);
        return Math.min(dl,Math.min(dr,dwon))+matrix[i][j];
    }
    public static int TD(int[][] matrix,int[][] dp,int i,int j,int n,int m){
        if(j<0 || j>=m){
            return Integer.MAX_VALUE;
        }
        if(i==n-1){
            return matrix[i][j];
        }
        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }
        int dl=TD(matrix,dp,i+1,j-1,n,m);
        int dr=TD(matrix,dp,i+1,j+1,n,m);
        int dwon=TD(matrix,dp,i+1,j,n,m);
        return dp[i][j]= Math.min(dl,Math.min(dr,dwon))+matrix[i][j];
    }
}
