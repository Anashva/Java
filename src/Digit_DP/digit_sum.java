package Digit_DP;

import java.util.*;
public class digit_sum {
    static int mod=1000000007;
    static long[][][][] dp;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int D=sc.nextInt();
        dp=new long[s.length()+1][2][2][101];
        for(long[][][] a:dp){
            for(long[][] b:a){
                for(long[] c:b){
                    Arrays.fill(c,-1);
                }
            }
        }
        long ans=count(s,0,1,0,D,1);
        ans=(ans-1+mod)%mod;
        System.out.println(ans);
    }
    public static long count(String s,int idx,int tight,int sum,int d,int lz){
        if(idx==s.length()){
            return sum%d==0 ? 1:0;
        }
        if(dp[idx][tight][lz][sum]!=-1){
            return dp[idx][tight][lz][sum];
        }
        int lb=0;
        int ub=(tight==1) ? s.charAt(idx)-'0' :9;
        long ans=0;
        for(int digit=lb;digit<=ub;digit++){
            int newt=(tight==1 && digit==ub) ? 1:0;
            int newlz=(lz==1 && digit==0) ? 1 : 0;
            int newsum=(lz==1 && digit==0) ? sum : (sum+digit)%d;
            ans=(ans+count(s,idx+1,newt,newsum,d,newlz))%mod;
        }
        return dp[idx][tight][lz][sum]=ans;
    }
}
