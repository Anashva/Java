package Infinity_Champions_Program;

public class Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I {
    public static void main(String[] args) {

    }
    public int minOperations(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<=n-3;i++){
            if(nums[i]==0){
                nums[i]^=1;
                nums[i+1]^=1;
                nums[i+2]^=1;
                ans++;
            }
        }
        if(nums[n-1]==0 || nums[n-2]==0){
            return -1;
        }
        return ans;
    }
}
