package CODE_FORCES;

import java.util.Scanner;

public class Unique_Bid_Auction {
    public static void main(strin[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(arr.length==1){
                System.out.println(1);
            }
            else{
                int c=0;
                int min=arr[0];
                int idx=0;
                for(int i=0;i<n-1;i++){
                    if(arr[i]!=arr[i+1]){
                        if(arr[i]<min){
                            min=arr[i];
                            idx=i+1;
                        }

                    }
                    else {
                        c++;
                    }
                }
                if(c==0 ){
                    System.out.println(idx);
                }
                else{
                    System.out.println(-1);
                }
            }

            t--;
        }
    }
}
