package CODE_FORCES;

import java.util.Arrays;
import java.util.Scanner;

public class Game0fAthelit {
    public static void main(strin[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            int c=0;
            Arrays.sort(arr);
            int i=0;
            int j=n-1;
            while(i<j){
                if(arr[i]+arr[j]==k){
                    c++;
                    i++;
                    j--;
                }
                else if(arr[i]+arr[j]<k){
                    i++;
                }
                else if(arr[i]+arr[j]>k){
                    j--;
                }
            }
            System.out.println(c);
        }
    }
}
