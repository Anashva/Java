package CODE_FORCES;

import java.util.Scanner;

public class Tales_of_Sort {
    public static void main(strin[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int n= sc.nextInt();
            int [] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            int c=0;
            for(int i=1;i<arr.length;i++){
                if(arr[i-1]>arr[i]){
                    c=Math.max(c,arr[i-1]);
                }
            }
            System.out.println(c);
            t--;
        }

    }
}
