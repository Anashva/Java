package lecture18;

public class subarray_product_less_than_k {
    public static void main(String[] args) {
        int[] arr={10,5,2,6};
        int k=100;
        int ans=0;
        int end=0;
        int p=1;
        int start=0;
        while(end<arr.length){
            // grow
            p=p*arr[end];

            // shrink
            while(p>=k){
                p=p/arr[start];
                start++;
            }

            // ans update
            ans=Math.max(ans,end-start+1);
            end++;
        }
        System.out.println(ans);
    }
}
