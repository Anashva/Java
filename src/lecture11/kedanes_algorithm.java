package lecture11;

import java.util.Scanner;

public class kedanes_algorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int s=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            s=s+arr[i];
            ans=Math.max(ans,s);
            if(s<0){
                s=0;
            }
        }
        System.out.println(ans);

    }

    }

