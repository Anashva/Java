package LEETCODES;

import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        String s="";
        for(int i=n-1;i>=0;i--){
            s=s+arr[i];
        }
        System.out.print(s);

    }
}
