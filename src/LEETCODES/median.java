package LEETCODES;

import java.util.Arrays;
import java.util.Scanner;

public class median {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums1=new int[n];
        for(int i=0;i<n;i++) {
            nums1[i] = sc.nextInt();
        }

        int m=sc.nextInt();
        int[] nums2=new int[n];
        for(int i=0;i<n;i++) {
            nums2[i] = sc.nextInt();
        }
        int[] nums=new int[n+m];
        for(int i=0;i<n;i++){
            nums[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            nums[n+i]=nums1[i];
        }
        Arrays.sort(nums);
        double s=0;
        if((n+m)%2!=0){
            System.out.print(nums[(m+n)/2]);

        }
        else{
            int p=nums[(n+m)/2];
            int t=nums[(n+m)/2-1];
            s=(p+t)/2.0;
            System.out.print(s);

        }
    }
}
