package cf;

import java.util.Arrays;
import java.util.Scanner;
public class Twin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int s=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            s+=arr[i];
        }
        int sum=0;
        int c=0;
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--){
            c++;
            sum+=arr[i];
            if(sum>s-sum){
                break;
            }
        }
        System.out.println(c);
    }
}
