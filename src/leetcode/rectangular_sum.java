package leetcode;

import java.util.Scanner;

public class rectangular_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] matrix=new int[n];
        for (int i=0;i<n;i++) {
            matrix[i] = sc.nextInt();
        }
        System.out.print(rec_sum(matrix));
    }
    public static int rec_sum(int[] nums){
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        while(n>0){
            for(int i=0;i<n-1;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
            n--;
        }
        return nums[0];
    }
}
