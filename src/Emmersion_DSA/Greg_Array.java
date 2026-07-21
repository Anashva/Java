package Emmersion_DSA;

import java.util.Scanner;

public class Greg_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] l=new int[m+1];
        int[] r=new int[m+1];
        int[] d=new int[m+1];
        for (int i=1;i<=m;i++){
            l[i]=sc.nextInt();
            r[i]=sc.nextInt();
            d[i]=sc.nextInt();
        }
        long[] diff=new long[m+2];
        for (int i=0;i<k;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            diff[x]++;
            diff[y+1]--;
        }

        long[] count=new long[m+1];
        for (int i=1;i<=m;i++){
            count[i]=count[i-1]+diff[i];
        }
        long[] op=new long[n+2];
        for (int i=1;i<=m;i++){
            long val=count[i]*d[i];
            op[l[i]]+=val;
            op[r[i]+1]-=val;
        }
        long sum=0;
        for (int i=1;i<=n;i++){
            sum+=op[i];
            System.out.print(sum+arr[i-1]+" ");
        }
    }
}
