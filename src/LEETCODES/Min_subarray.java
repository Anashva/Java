package LEETCODES;

import java.util.Scanner;

public class Min_subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int s=0;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            s=s+arr[i];
            mini=Math.min(mini,s);
        }
        System.out.print(mini);
    }
}
