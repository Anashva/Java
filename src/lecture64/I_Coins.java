package lecture64;


import java.util.*;
public class I_Coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] arr=new double[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double[][] dp=new double[((n+1)/2)+1][n+1];
        for (double[] a:dp){
            Arrays.fill(a,-1);
        }
        System.out.println(prob((n+1)/2,arr,0,dp));
    }
    public static double prob(int c,double[] arr,int idx,double[][] dp){
//        TC-> 2^n
        if(c==0){
            return 1;
        }
        if(idx==arr.length){
            return 0;
        }
        if(dp[c][idx]!=-1){
            return dp[c][idx];
        }
        double head=arr[idx]*prob(c-1,arr,idx+1,dp);
        double tail=(1.0-arr[idx])*prob(c,arr,idx+1,dp);
        return dp[c][idx]=head+tail;
    }
}
