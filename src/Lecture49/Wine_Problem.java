package Lecture49;

import lecture34_generics.B;

public class Wine_Problem {
//    jab jab end fix hoga tb dp diagonaly fill hoga
    public static void main(String[] args) {
        int[] wine={2,3,5,1,4};
        System.out.println(maximum_profit(wine,0, wine.length-1,1));
        System.out.println(BU(wine));
    }

    public static int maximum_profit(int[] wine,int i,int j,int year ){
        if (i>j){
            return 0;
        }
        int fs=wine[i]*year+maximum_profit(wine,i+1,j,year+1);
        int ls=wine[j]*year+maximum_profit(wine,i,j-1,year+1);
        return Math.max(fs,ls);
    }
    public static int BU(int[] wine){
        int[][] dp=new int[wine.length][wine.length];
        for (int i=0;i<dp.length;i++){
            dp[i][i]=wine[i]* wine.length;
        }
        int year= wine.length-1;
        for (int i=1;i< wine.length;i++){
            for (int j=i;j< wine.length;j++){
                int k=j-i;
                int fs=wine[k]*year+dp[k+1][j];
                int ls=wine[j]*year+dp[k][j-1];
                dp[k][j]=Math.max(fs,ls);
            }
            year--;
        }
        return dp[0][dp.length-1];
    }
}
