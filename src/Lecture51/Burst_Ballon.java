package Lecture51;

public class Burst_Ballon {
    public static void main(String[] args) {
        int[] arr={3,1,5,8};
        int[] a=new int[arr.length+2];
        a[0]=1;
        a[a.length-1]=1;
        for (int i=0;i<arr.length;i++){
            a[i+1]=arr[i];
        }
        System.out.println(bb(a,0, a.length-1));

    }
    public static int bb(int[] a,int i,int j){
        if (i+1==j){
            return 0;
        }
        int ans=Integer.MIN_VALUE;
        for (int k=i+1;k<j;k++){
            int left=bb(a,i,k);
            int right=bb(a,k,j);
            int self=a[i]*a[k]*a[j];
            ans=Math.max(ans,left+right+self);
        }
        return ans;
    }
}
