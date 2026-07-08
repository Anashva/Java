package cf;

import java.util.Scanner;

public class strange_partition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] arr=new int[n];
            long total=0;
            long msum=0;
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                total+=arr[i];
                msum+=(arr[i]+x-1)/x;
            }
            long misum=(total+x-1)/x;
            System.out.println(misum+" "+msum);

        }
    }
}
