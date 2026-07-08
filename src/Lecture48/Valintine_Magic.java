package Lecture48;

import java.util.Arrays;

public class Valintine_Magic {
    public static void main(String[] args) {
        int[] boys={2,11,3};
        int[] girls={5,7,3,2};
        Arrays.sort(boys);
        Arrays.sort(girls);
        int[][] dp=new int[girls.length+1][boys.length+1];
        for (int[] a:dp){
            Arrays.fill(a,-1);
        }
        System.out.println(TD(boys,girls,0,0,dp));
        System.out.println(vm(boys,girls,0,0));
    }
    public static int vm(int[] boys,int[] girls,int i,int j){
        if(j==boys.length){
            return 0;
        }
        if(i== girls.length){
            return 1000000;//number overflow k chance k vjh se max value use nhi karenge
        }
        int pick=Math.abs(boys[j]-girls[i])+vm(boys, girls, i+1,j+1);
        int npick=vm(boys, girls, i+1, j);

        return Math.min(pick,npick);
    }
    public static int TD(int[] boys,int[] girls,int i,int j,int[][] dp){
        if(j==boys.length){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i== girls.length){
            return 1000000;//number overflow k chance k vjh se max value use nhi karenge
        }
        int pick=Math.abs(boys[j]-girls[i])+TD(boys, girls, i+1,j+1,dp);
        int npick=TD(boys, girls, i+1, j,dp);

        return dp[i][j]=Math.min(pick,npick);
    }


}
