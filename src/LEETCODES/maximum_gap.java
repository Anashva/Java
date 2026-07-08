package LEETCODES;
import java.util.Arrays;
import java.util.Scanner;
public class maximum_gap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        if(n<2){
            System.out.print(0);
        }
        else{
            Arrays.sort(arr);
            int diff=0;
            int ans=Integer.MIN_VALUE;
            for(int i=0;i<n-1;i++){
//                diff=arr[i+1]-arr[i];
                ans=Math.max(ans,arr[i+1]-arr[i]);
            }
            System.out.print(ans);
        }
    }
}
