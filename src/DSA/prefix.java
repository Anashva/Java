package DSA;

public class prefix {
    public static int[] leftRightDifference(int[] nums) {
        if(nums.length==1){
            int[] answer=new int[1];
            answer[0]=0;
            return answer;
        }
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=0;
        right[nums.length-1]=0;
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]+nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(right[i]+" ");
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums={10,4,8,3};
        leftRightDifference(nums);
//        for(int i=0;i<nums.length;i++){
//            System.out.print(nums[i]+" ");
//        }

//        System.out.print(findMiddleIndex(nums));
    }
//    public static int findMiddleIndex(int[] nums) {
//        int n = nums.length;
//        int[] prefix = new int[n];
//        int[] suffix = new int[n];
//
//        prefix[0] = nums[0];
//        suffix[n-1] =nums[n-1];
//
//        for(int i =1; i<n ;i++){
//            prefix[i] = prefix[i-1] + nums[i];
//        }
//        for(int i = n-2; i>=0 ; i--){
//            suffix[i] = suffix[i+1] +nums[i];
//        }
//
//        for(int i =0; i<n ; i++){
//            if(prefix[i] == suffix[i]){
//                return i;
//            }
//        }
//
//        return -1;
//    }
}
