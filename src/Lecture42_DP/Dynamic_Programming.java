package Lecture42_DP;

public class Dynamic_Programming {
//    DP:-its not data structure its problem solving technique
//    depends on past
//    how to identify any ques is used dp?
//    optimal substructure or overlaping :-pehle level me jo tree bana rhe hoage bhi same aa rha h  ya overlap kr rha hai
//    dp tabhi lagega jaha pr overlapping hoga
//    two approach ->
//    1>top down  ->recusive -->memoriaztion
//    2>bottom-up ->iterative->


    public static void main(String[] args) {
        int n=8;
        int[] dp=new int[n+1];
//        System.out.println(fib(n));
        System.out.println(FibTD(n,dp));
        System.out.println(FibBU(n,dp));
    }
    public static int FibTD(int n,int[]dp){
//        TC->Linear 0(n)
//        SC-> 0(n)
        if(n==0 || n==1){
            return  n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int f1=fib(n-1);
        int f2=fib(n-2);
        return dp[n]= f1+f2;
    }
    public static int fib(int n){
//        TC->exponential-2^n
//        SC->0(1)

        if(n==0 || n==1){
            return n;
        }
        int f1=fib(n-1);
        int f2=fib(n-2);
        return f1+f2;
    }
    public static int FibBU(int n,int [] dp){
//        optimized than all
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}
