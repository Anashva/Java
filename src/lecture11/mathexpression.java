package lecture11;

public class mathexpression {
    public static int  binary(int k,int n){
        int l=1;
        int h=n;
        int ans=0;
        for(int i=l;i<=h;i++) {
            int mid = (l + h) / 2;
            if (Math.pow(mid, k) <= n) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int k=3;
        int n=145;
        System.out.println(binary(k,n));

    }
}
