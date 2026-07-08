package Digit_DP;

import java.util.*;
public class Digit_Count_in_Range{
    static long[][][][] dp;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        Long l=sc.nextLong();
        Long r=sc.nextLong();
        String start=Long.toString(l-1);
        String finish=Long.toString(r);
        dp=new long[start.length()][2][2][start.length()+1];
        for(long[][][] a:dp){
            for(long[][] b:a){
                for(long[] c:b){
                    Arrays.fill(c,-1);
                }
            }
        }
        long left=count(start,1,0,1,0,d);
        dp=new long[finish.length()][2][2][finish.length()+1];
        for(long[][][] a:dp){
            for(long[][] b:a){
                for(long[] c:b){
                    Arrays.fill(c,-1);
                }
            }
        }
        long right=count(finish,1,0,1,0,d);
        System.out.println(right-left);
    }
    public static long count(String s,int tight,int idx,int lz,int sum,int d){
        if(idx==s.length()){
            return sum;
        }

        if(dp[idx][tight][lz][sum]!=-1){
            return dp[idx][tight][lz][sum];
        }

        int lb=0;
        int ub=(tight==1) ? s.charAt(idx)-'0' : 9;
        long ans=0;
        for(int digit=lb;digit<=ub;digit++){
            int newtight=(tight==1 && digit==s.charAt(idx)-'0') ? 1:0;
            if(digit==0 && lz==0){
                ans+=count(s,newtight,idx+1,lz,sum,d);
            }
            else{
                int newsum=(digit==d) ? sum+1 : sum;
                int newlz=(lz==1 && digit==0) ? 1: 0;
                ans+=count(s,newtight,idx+1,lz,newsum,d);

            }
        }
        return dp[idx][tight][lz][sum]=ans;
    }
}
