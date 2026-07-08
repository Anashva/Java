package assignment_1;
import java.util.*;
public class calculate_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int q=sc.nextInt();
        int s=0;
        int[] nums=new int[n];
        nums[0]=arr[0]+arr[n-1];
        while(q>0){
            int x=sc.nextInt();
            for(int i=1;i<n;i++){
                nums[i]=arr[i]+arr[i-1];
                }
            for(int i=0;i<n;i++){
                nums[i]=arr[i]*2;
            }
            q--;
            }
        for(int i=0;i<n;i++){
            s=s+nums[i];
            }
        int k=(int)(Math.pow(10,9))+7;
        System.out.println((s%k)*2);

    }
}
