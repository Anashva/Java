package DSA;
import java.util.*;
public class reverse_pairs493 {
    public static void main(String[] args) {
        int[] nums={2,4,3,5,1};
        int l=0;
        int h=nums.length-1;
        int mid=l+(h-l)/2;
        int[] arr1=new int[mid];
        int[] arr=new int[nums.length-mid];
        for(int i=0;i<mid;i++){
            arr1[i]=nums[i];
        }
        int k=0;
        for(int i=mid;i<nums.length;i++){
            arr[k++]=nums[i];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr);
        int n=0;
        int c=0;
        for(int i=0;i<mid;i++){
            for(int j=arr.length-1;j>=0;j--){
                if(arr1[i]>2*arr[j]){
                    c++;
                }
            }
        }
        for(int i=0;i<mid-1;i++){
            if(arr1[i]>2*arr1[i+1]){
                c++;
            }
        }
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i+1]>2*arr[i]){
                c++;
            }
        }
        System.out.println(c);

    }
}
