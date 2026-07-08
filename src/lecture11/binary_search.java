package lecture11;

import java.util.Scanner;
public class binary_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int m= sc.nextInt();
        System.out.println(binary(arr,m));

    }
    public static int binary(int[]arr,int m){
        int start=0;
        int  end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(m==arr[mid]){
                return mid;
            }
            if(m>arr[mid]){
                start=mid+1;
            }
            if(m<arr[mid]){
                end=mid-1;
            }
        }
        return -1;
    }

}
