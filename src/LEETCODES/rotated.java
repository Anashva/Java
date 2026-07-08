package LEETCODES;

import java.util.Scanner;

public class rotated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target= sc.nextInt();
        System.out.print(binary(nums,target));
    }
    public static int binary(int[]nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;

            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else
            {
                return mid;

            }
        }
        return -1;
    }
}
