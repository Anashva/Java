package lecture11;

public class Bad_version {
    public static int First_Version(int n){
        int l=1;
        int h=n;
        int ans=0;
        while(l<=h){
            int mid = l+(h-l) / 2;
            if(isBadVersion(mid)==true){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
    public static boolean isBadVersion(int mid){
        return true;
    }
}
