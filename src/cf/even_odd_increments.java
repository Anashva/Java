package cf;

import java.util.Scanner;

public class even_odd_increments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            int[] arr=new int[n];
            long sum=0;
            int even=0;
            int odd=0;
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
                if(arr[i]%2==0){
                    even++;
                }
                else {
                    odd++;
                }
            }
            while(q-->0){
                int type=sc.nextInt();
                int x=sc.nextInt();
                if(type==0){
                    sum+=(long)even*x;
                    if (x%2==1){
                        odd+=even;
                        even=0;
                    }
                }
                else{
                    sum+=(long)odd*x;
                    if (x%2==1){
                        even+=odd;
                        odd=0;
                    }
                }
                System.out.println(sum);
            }

        }
    }
}
