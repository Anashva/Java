package jpmc;

public class subarray_div {
    public static void main(String[] args) {
        int[] arr={4,5,0,-2,-3,1};
        System.out.println(count(arr));

    }
    public  static long count(int[] arr){
        int n=arr.length;
        long[] freq=new long[n];
        long sum=0;
        freq[0]=1;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            int r=(int)(sum%5);
            if(r<0){
                r+=5;//-ve
            }
            freq[r]++;
        }
        long ans=0;
        for (int i=0;i<freq.length;i++){
            if(freq[i]>=2){
                long x=freq[i];
//                ans+=(x*(x-1)/2);
                ans=Math.max(ans,(x*(x-1)/2));
            }
        }
        return ans;
    }
}
