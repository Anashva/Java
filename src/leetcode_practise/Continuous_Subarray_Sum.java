package leetcode_practise;

public class Continuous_Subarray_Sum {
    public static void main(String[] args) {
        int[] nums={23,2,4,6,7};
        int k=6;
        System.out.println(checkSubarraySum(nums,k));
    }
    public static boolean checkSubarraySum(int[] nums, int k) {
        int s=0;
        for(int i=0;i<2;i++){
            s+=nums[i];
        }
        if(s%k==0){
            return true;
        }
        int ans=s;
        for(int i=2;i<nums.length;i++){
            ans+=nums[i];
            ans=ans-nums[i-1];
            System.out.println(ans);
            if(ans%k==0){
                return true;
            }
        }
        return false;
    }
}
