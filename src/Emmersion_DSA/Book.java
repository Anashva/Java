package Emmersion_DSA;

import java.util.*;

public class Book {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long t=sc.nextLong();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        long sum=0;
        int start=0;
        int end=0;
        int ans=0;
        while(end<n){
            sum+=arr[end];
            while(sum>t){
                sum-=arr[start];
                start++;
            }
            ans=Math.max(ans,end-start+1);
            end++;
        }
        System.out.println(ans);
    }
}
