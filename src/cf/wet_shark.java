package cf;

import java.util.Scanner;
public class wet_shark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        long sum=0;
        long odd=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
            if(arr[i]%2==1){
                odd=Math.min(odd,arr[i]);
            }
        }
        if(sum%2==1){
            sum-=odd;
        }
        System.out.println(sum);
    }
}
