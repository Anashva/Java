package lecture17_string_arrayLIst;

public class circularsum {
    public static void main(String[] args) {
        int[] arr={8,-8,9,-9,10,-11,12};
        System.out.println(Maxmum(arr));
    }
    public static int Maxmum(int[] arr){
        int linear=kedense(arr);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr[i]=arr[i]* -1;
        }
        int mid=kedense(arr);
        int cs=sum+mid;//circular sum
        if(cs==0){
            return linear;
        }
        return Math.max(cs,linear);
    }
    public static int kedense(int[] arr){
        int s=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            s=s+arr[i];
            ans=Math.max(ans,s);
            if(s<0){
                s=0;
            }
        }
        return ans;
    }
}
