package Lecture49;

public class LIS {
    public static void main(String[] args) {
//        nLogn
        int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
        System.out.println(lis(arr));

    }
    public static int lis(int[] arr){
        int[] dp=new int[arr.length];
        int len=1;
        dp[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>dp[len-1]){
                dp[len]=arr[i];
                len++;
            }
            else {
                int idx=BinarySeacrh(dp,0,len-1,arr[i]);
                dp[idx]=arr[i];
            }
        }
        return len;
    }
    public static int BinarySeacrh(int[] dp,int l,int h,int item){
        int idx=0;
        while (l<=h){
            int mid=l+(h-l)/2;
            if(dp[mid]>=item){///smallest possible ending element of an increasing subsequence of length i+1
                idx=mid;
                h=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        return idx;
    }
}
