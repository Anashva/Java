package leetcode_practise;

public class Shortest_Subarray_with_Sum_Least_K {
    public static void main(String[] args) {
        int[] nums={2,-1,2};
        int k=4;
        System.out.println(shortestSubarray(nums,k));
    }
    public static int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(prefix[i]);
        }

        return -1;
    }
}
