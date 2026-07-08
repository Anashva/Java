package cf;

import lecture34_generics.A;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class promo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int quer=sc.nextInt();
        Integer [] arr=new Integer[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int [] pref=new int[n+1];
        for (int i=0;i<n;i++){
            pref[i+1]=pref[i]+arr[i];
        }
        while(quer-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int sum=pref[x]-pref[x-y];
            System.out.println(sum);
        }
    }
}
