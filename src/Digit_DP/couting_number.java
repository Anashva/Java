package Digit_DP;


import java.util.*;
public class couting_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        String l=Long.toString(a-1);
        String r=Long.toString(b);
        long[][][][] dp=new long[2][11][20][2];
        resetDP(dp);
        long right=dpp(r,1,10,0,1,dp);
        resetDP(dp);

        long left=dpp(l,1,10,0,1,dp);
        System.out.println(right-left);
    }
    public static void resetDP(long[][][][] dp) {
        for (long[][][] a : dp)
            for (long[][] b : a)
                for (long[] c : b)
                    Arrays.fill(c, -1);
    }
    public static long dpp(String s,int tight,int prev,int idx,int lz,long [][][][] dp){
        if(idx==s.length()){
            return 1;
        }
        if(dp[tight][prev][idx][lz]!=-1){
            return dp[tight][prev][idx][lz];
        }
        int lb=0;
        int ub=(tight==1) ? (s.charAt(idx)-'0') :9;
        long res=0;
        for (int digit=lb;digit<=ub;digit++){
            boolean flag=(lz==1) ?false:true;
            if(digit==prev && lz==0){
                continue;
            }
//            valid case
            res+=dpp(s,(tight==1 && digit==ub) ?1 :0,digit,idx+1,(lz==1 && digit==0) ?1:0,dp);
        }
        return dp[tight][prev][idx][lz]=res;
    }
}
