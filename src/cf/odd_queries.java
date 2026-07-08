package cf;

import java.util.Scanner;
public class odd_queries {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t-->0){
//            int n=sc.nextInt();
//            int q=sc.nextInt();
//            int[] arr=new int[n];
//            long[] pfx=new long[n+1];
//            for (int i=0;i<n;i++){
//                arr[i]=sc.nextInt();
//                pfx[i+1]=pfx[i]+arr[i];
//            }
//            long sum=pfx[n];
//            for(int i=0;i<n;i++){
//                int l=sc.nextInt();
//                int r=sc.nextInt();
//                int k=sc.nextInt();
//                long osum=pfx[r]-pfx[l-1];
//                long nrsum=(long) (r-l+1)*k;
//                long ntsum=sum-osum+nrsum;
//                if (ntsum%2==1){
//                    System.out.println("YES");
//                }
//                else {
//                    System.out.println("NO");
//                }
//            }
//        }
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if ((k - n) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
