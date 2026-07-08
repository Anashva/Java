package Lecture62;

import java.util.*;
public class Preparing_Olympaid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        int x=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(Number(arr,l,r,x));

    }
    public static int Number(int[] arr,int l,int r,int x){
        int n=arr.length;
        int c=0;
        for (int i=3;i< (1 <<n);i++){
            if(setbit(i)>=2 && isitpossible(arr,l,r,x,i)){
                c++;
            }
        }
        return c;
    }

    public static boolean isitpossible(int[] arr,int l,int r,int x,int i){
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int idx=0;
        while(i>0){
            if((i & 1)==1){
                sum+=arr[idx];
                min=Math.min(min,arr[idx]);
                max=Math.max(max,arr[idx]);
            }
            i >>=1;
            idx++;
        }
        return sum>=l && sum<=r && max-min>=x;
    }

    public static  int setbit(int n){
        int ans=0;
        while(n>0){
            ans++;
            n=n & (n-1);

        }
        return ans;
    }
}
