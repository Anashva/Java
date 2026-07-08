package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class first_last_posiition {
    public static void sorted(int[]nums,int target){
        int n=nums.length;
        int[] arr=new int[n];
        Arrays.sort(nums);

        int p=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                arr[i]=i;
            }
            else{
                p++;
            }
        }
        if(p==0){
            for(int m=0;m<n;m++){
                System.out.println(arr[m]);
            }
        }
        else{
            int[] ans={-1,-1};
            for(int k=0;k<2;k++){
                System.out.println(ans[k]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target= sc.nextInt();
        sorted(nums,target);

    }
}
