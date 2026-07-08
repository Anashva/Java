package CODE_FORCES;

import java.util.Scanner;

public class Subtract_Min_Sort {
    public static void main(strin[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            if(sort(arr)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
    public static boolean sort(int[] arr){
        int a=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<a){
                return false;
            }
            a= Math.min(arr[i],a);
        }
        return true;
    }
}
