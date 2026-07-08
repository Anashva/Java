package lecture18;

public class Sliding_Window {
    public static void main(String[] args) {
//        Sliding Window-not data structure,it is algorithm,input me array given,string given hoga,k koi variable given hoga aur output me substring or subarray mang rha hoga kuch condition given hoga like minima maximia
//        fixed sized window and variable size window
        int k=3;
        int[] arr={2,3,1,1,5,7,8,3,4};
        int s=0;
        int ans=0;
        for(int i=0;i<k;i++){
            s+=arr[i];
        }
        ans=s;
        for(int i=k;i<arr.length;i++){
//            grow
            s+=arr[i];
//            shrink
            s-=arr[i-k];
//            ans update
            ans=Math.max(ans,s);
        }
        System.out.println(ans);

    }
}
