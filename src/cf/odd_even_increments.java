package cf;

import java.util.Scanner;

public class odd_even_increments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int even=arr[0]%2;
            int odd=even;
            if(n>1){
                odd=arr[1]%2;
            }
            boolean flag=true;
            for (int i=0;i<n;i++){
                if(i%2==0 && arr[i]%2!=even){
                    flag=false;
                }
                if (i%2==1 && arr[i]%2!=odd){
                    flag=false;
                }
            }
            if(flag){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
