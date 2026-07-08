package LEETCODES;

import java.util.Scanner;

public class Subarray_Product_Less_Than_K {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int k=sc.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            int s=1;
            for(int j=i;j<n;j++){
                s*=arr[j];
                if(s<k){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
