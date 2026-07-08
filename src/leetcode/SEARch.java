package leetcode;

import java.util.Scanner;

public class SEARch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.print(i);
                break;
            }
            else{
                c++;
            }
        }
        if(c==n){
            for(int i=n-1;i>=0;i--){
                if(arr[i]<target){
                    System.out.print(i+1);
                    break;
                }
            }
        }

    }
}
