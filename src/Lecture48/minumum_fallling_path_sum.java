package Lecture48;

import java.util.Arrays;

public class minumum_fallling_path_sum {
    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        int ans=Integer.MAX_VALUE;
        int[][] dp=new int[matrix.length][matrix[0].length];
        for (int[] a:dp){
            Arrays.fill(a,-100000);
        }
        for (int i=0;i<matrix[0].length;i++){
            ans=Math.min(ans,mfpa(matrix,0,i,dp));
        }
        System.out.println(ans);
    }
    public static int mfpa(int[][] matrix,int cr,int cc,int[][]dp){
        if(cc<0 || cc>=matrix[0].length){
            return Integer.MAX_VALUE;
        }
        if (cr==matrix.length-1){
            return matrix[cr][cc];
        }

        if(dp[cr][cc]!=-100000){
            return dp[cr][cc];
        }
        int ld=mfpa(matrix,cr+1,cc-1,dp);
        int rd=mfpa(matrix,cr+1,cc+1,dp);
        int d=mfpa(matrix,cr+1,cc,dp);
        return dp[cr][cc]=Math.min(ld,Math.min(rd,d))+matrix[cr][cc];
    }
}
