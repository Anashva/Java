package LEETCODES;

import java.util.Scanner;

public class Merged_array {
//        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//            int n=nums1.length;
//            int m=nums2.length;
//            int[] nums=new int[n+m];
//            for(int i=0;i<n;i++){
//                nums[i]=nums1[i];
//            }
//            for(int i=0;i<m;i++){
//                nums[n+i]=nums1[i];
//            }
//            double s=0;
//            int k=n+m;
//            if(k%2==0){
//                s=(k/2+(k/2+1))/2;
//            }
//            else{
//                s=(k+1)/2;
//            }
//            return s;
//        }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {9, 5, 6};

        int[] mergedArray = new int[array1.length + array2.length];

        // Copy elements from the first array
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy elements from the second array
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        // Print merged array
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        int[] arr1=new int[n];
//        for(int i=0;i<n;i++) {
//            arr1[i] = sc.nextInt();
//        }
//        int[] arr2=new int[m];
//        for(int i=0;i<m;i++) {
//            arr2[i] = sc.nextInt();
//        }
//        System.out.print(findMedianSortedArrays(arr1,arr2));
    }
}
