package assignment;
import java.util.*;
public class sum {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int[] nums=new int[n];
        int q=sc.nextInt();
        if(q==0){
            int p=0;
            for(int i=0;i<n;i++){
                p=p+arr[i];
            }
            p=p%(1000000000+7);
            System.out.println(p);
        }
        else{
            int s=0;
            while(q>0){
                int x=sc.nextInt();
                nums[0]=arr[0]+arr[n-1];
                for(int i=1;i<n;i++){
                    nums[i]=arr[i]+arr[i-1];
                }
                for(int i=0;i<n;i++){
                    arr[i]=nums[i]  ;
                }
                q--;
            }
            for(int i=0;i<n;i++){
                s=s+nums[i];
            }
            s=s%(1000000000+7);
            System.out.println(s);
        }
    }
}